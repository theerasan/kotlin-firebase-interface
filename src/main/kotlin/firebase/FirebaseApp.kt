package firebase

import firebase.functions.Https

external fun require(module:String):dynamic

class FirebaseApp {
    companion object {
        val functions = require("firebase-functions")
        val admin = require("firebase-admin")
        val https: Https = functions.https.unsafeCast<Https>()


    }
}