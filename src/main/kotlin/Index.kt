import express.Express
import extention.asModel
import firebase.FirebaseApp
import firebase.admin.firestore.Firestore
import model.Song

external val exports: dynamic
external fun require(module:String):dynamic

fun main(args: Array<String>) {

    val firebaseApp = FirebaseApp(require("firebase-admin"), require("firebase-functions"))

    val functions = firebaseApp.functions
    val admin = firebaseApp.admin

    admin.initializeApp(functions.config().firebase)

    val express = Express(require("express"))

    val api = express.api

    api.get("") {req, res ->
        res.status(200).send(req.param("nickName") ?: "no params")
    }

    api.post("/song/") {req, res->
        val song = req.body.asModel<Song>()
        console.log(song)
        res.status(200).send(song)
    }

    api.put("/song/") {req, res->
        val song = req.body.asModel<Song>()
        console.log(song)
        res.status(200).send("Song titled ${song.title} by ${song.artist} has been created")
    }

    api.delete("/song/:id") {req, res->
        val id = req.param("id") ?: ""
        res.status(200).send("Song id $id has been deleted")
    }

    exports.helloWorld = firebaseApp.https.onRequest(api)

    js("admin.firestore().settings({timestampsInSnapshots: true})")

    val firestore = admin.firestore() as Firestore
}