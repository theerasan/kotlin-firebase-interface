import admin.firestore.Firestore

external fun require(module:String):dynamic
external val exports: dynamic

fun main(args: Array<String>) {
    val functions = require("firebase-functions")
    val admin = require("firebase-admin")

    admin.initializeApp(functions.config().firebase)

    val express:dynamic = require("express")
    val api = express()

    api.get("") { _, res ->
        res.status(200).send("Hello world")
    }

    exports.helloWorld = functions.https.onRequest(api)

    js("admin.firestore().settings({timestampsInSnapshots: true})")

    val firestore = admin.firestore() as Firestore
}