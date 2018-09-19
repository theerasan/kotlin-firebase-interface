import express.ExpressExample
import extention.asModel
import firebase.FirebassAppExample
import model.SongExample

external val exports: dynamic
external fun require(module:String):dynamic

fun main(args: Array<String>) {

    val firebaseApp = FirebassAppExample()
    val admin = firebaseApp.admin
    val config = firebaseApp.config
    admin.initializeApp(config.firebase)
    val database = firebaseApp.database

    val express = ExpressExample(require("express"))

    val api = express.api

    api.get("") {req, res ->
        val key = database.ref("songs").push().key
        res.status(200).send("hello $key")
    }

    exports.helloWorld = firebaseApp.https.onRequest(api)
    exports.song = firebaseApp.https.onRequest(SongServiceExample(firebaseApp).getApi())
}