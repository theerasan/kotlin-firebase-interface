import express.Express
import express.ExpressApp
import firebase.FirebaseApp
import firebase.admin.firestore.Firestore

external fun require(module:String):dynamic
external val exports: dynamic

fun main(args: Array<String>) {
    val functions = FirebaseApp.functions
    val admin = FirebaseApp.admin

    admin.initializeApp(functions.config().firebase)

    val api = Express.api

    api.get("") {req, res ->
        res.status(404).send("Hello world 2")
    }

    exports.helloWorld = FirebaseApp.https.onRequest(api)

    js("admin.firestore().settings({timestampsInSnapshots: true})")

    val firestore = admin.firestore() as Firestore
}