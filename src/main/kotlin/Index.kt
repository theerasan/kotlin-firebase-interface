import express.ExpressExample
import extention.asModel
import firebase.FirebassAppExample
import model.SongExample

external val exports: dynamic
external fun require(module:String):dynamic

fun main(args: Array<String>) {

    val firebaseApp = FirebassAppExample(require("firebase-admin"), require("firebase-functions"))

    val functions = firebaseApp.functions
    val admin = firebaseApp.admin


    admin.initializeApp(functions.config().firebase)

    val express = ExpressExample(require("express"))

    val api = express.api

    api.get("") {req, res ->
        res.status(200).send(req.param("nickName") ?: "no params")
    }

    api.post("/song/") {req, res->
        val song = req.body.asModel<SongExample>()
        console.log(song)
        res.status(200).send(song)
    }

    api.put("/song/") {req, res->
        val song = req.body.asModel<SongExample>()
        console.log(song)
        res.status(200).send("SongExample titled ${song.title} by ${song.artist} has been created")
    }

    api.delete("/song/:id") {req, res->
        val id = req.param("id") ?: ""
        res.status(200).send("SongExample id $id has been deleted")
    }

    exports.helloWorld = firebaseApp.https.onRequest(api)
}