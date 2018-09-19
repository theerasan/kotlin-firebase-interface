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
    exports.songCreateObserve = firebaseApp.functionsDatabase.ref("/songs/{keys}/title").onCreate {snapshot, context ->
        val original = snapshot.`val`<String>()
        console.log("Uppercasing", context.params.keys as? Any, original)
        val toUpperCase = original.toUpperCase()
        snapshot.ref.parent?.child("upppercase")?.set(toUpperCase)
    }

    exports.songUpdateObserve = firebaseApp.functionsDatabase.ref("/songs/{keys}/").onUpdate {change, context ->
        console.log("onUpdate")
    }

    exports.songWriteObserve = firebaseApp.functionsDatabase.ref("/songs/{keys}/").onWrite {change, context ->
        console.log("onWrite")
    }

    exports.songSeleteObserve = firebaseApp.functionsDatabase.ref("/songs/{keys}/").onWrite {change, context ->
        console.log("on delete")
    }
}