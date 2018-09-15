package firebase

import firebase.functions.Https

class FirebaseApp(private val adminJS: dynamic, private val functionsJS: dynamic) {
    val functions =  functionsJS
    val admin = adminJS
    val https = functions.https.unsafeCast<Https>()
}