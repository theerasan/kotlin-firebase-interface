import express.ExpressExample
import firebase.FirebassAppExample

external val exports: dynamic
external fun require(module:String):dynamic

fun main(args: Array<String>) {

    val firebaseApp = FirebassAppExample()
    val admin = firebaseApp.admin
    val config = firebaseApp.config
    admin.initializeApp(config.firebase)
    val database = firebaseApp.database

    val express = ExpressExample()
    val api = express.api

    api.get("") {req, res ->
        res.status(200).send("hello")
    }

    exports.helloWorld = firebaseApp.https.onRequest(api)
    exports.song = firebaseApp.https.onRequest(SongServiceExample(firebaseApp).getApi())
    exports.songCreateObserve = firebaseApp.functionsDatabase.ref("/songs/{keys}/title").onCreate {snapshot, context ->
        val original = snapshot.`val`<String>()
        console.log("Uppercasing", context.params.keys as? Any, original)
        val toUpperCase = original.toUpperCase()
        snapshot.ref.parent?.child("upppercase")?.set(toUpperCase)
    }
    exports.songUpdateObserve = firebaseApp.functionsDatabase.ref("/songs/{keys}/").onUpdate {_, _ ->
        console.log("onUpdate")
    }
    exports.songWriteObserve = firebaseApp.functionsDatabase.ref("/songs/{keys}/").onWrite {_, _ ->
        console.log("onWrite")
    }
    exports.songSeleteObserve = firebaseApp.functionsDatabase.ref("/songs/{keys}/").onWrite {_, _ ->
        console.log("on delete")
    }

    exports.songDoc = firebaseApp.https.onRequest(SongDocServiceExample(firebaseApp).getApi())
}