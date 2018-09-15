package firebase

import firebase.functions.Https

external interface FirebaseApp {
    val admin: dynamic
    val functions: dynamic
    val https: Https
}