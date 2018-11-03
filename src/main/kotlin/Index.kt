import express.ExpressExample
import firebase.FirebassAppExample
import model.SongExample

external val exports: dynamic
external fun require(module: String): dynamic

fun main(args: Array<String>) {

    val firebaseApp = FirebassAppExample()
    val admin = firebaseApp.admin
    val config = firebaseApp.config
    admin.initializeApp(config.firebase)
    val database = firebaseApp.database

    val express = ExpressExample()
    val api = express.api

    api.get("") { req, res ->
        res.status(200).send("hello")
    }

    exports.helloWorld = firebaseApp.https.onRequest(api)
    exports.song = firebaseApp.https.onRequest(SongServiceExample(firebaseApp).getApi())
    exports.songCreateObserve = firebaseApp.databaseTriggers.ref("/songs/{keys}/title").onCreate { snapshot, context ->
        val original = snapshot.`val`<String>()
        console.log("Uppercasing", context.params.keys as? Any, original)
        val toUpperCase = original.toUpperCase()
        snapshot.ref.parent?.child("upppercase")?.set(toUpperCase)
    }
    exports.songUpdateObserve = firebaseApp.databaseTriggers.ref("/songs/{keys}/").onUpdate { change, context ->
        console.log("onUpdate")
    }
    exports.songWriteObserve = firebaseApp.databaseTriggers.ref("/songs/{keys}/").onWrite { change, context ->
        console.log("onWrite")
    }
    exports.songDeleteObserve = firebaseApp.databaseTriggers.ref("/songs/{keys}/").onWrite { change, context ->
        console.log("on delete")
    }
    exports.songDoc = firebaseApp.https.onRequest(SongDocServiceExample(firebaseApp).getApi())

    exports.songDocCreateObserve = firebaseApp.firestoreTrigger
            .document("songs/{songId}")
            .onCreate { snapshot, _ ->
                val song = snapshot.data<SongExample>()
                console.log("create ${song.title}")
            }

    exports.songDocWriteObserve = firebaseApp.firestoreTrigger
            .document("songs/{songId}")
            .onWrite { change, _ ->
                console.log("write")
            }

    exports.songDocUpdateObserve = firebaseApp.firestoreTrigger
            .document("songs/{songId}")
            .onUpdate { change, _ ->
                val song = change.before.data<SongExample>()
                val songEdit = change.after.data<SongExample>()
                console.log("update ${song.title} to ${songEdit.title}")
            }

    exports.songDocDeleteObserve = firebaseApp.firestoreTrigger
            .document("songs/{songId}")
            .onDelete { snapshot, _ ->
                val song = snapshot.data<SongExample>()
                console.log("${song.title} has been deleted")
            }

    exports.storageTrigger = firebaseApp.storageTrigger.onFinalize { obj ->
        console.log(JSON.stringify(obj))
    }
}