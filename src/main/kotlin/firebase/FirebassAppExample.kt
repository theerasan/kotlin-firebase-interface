package firebase

import firebase.functions.Https

class FirebassAppExample(override val admin: dynamic, override val functions: dynamic) : FirebaseApp {
    override val https: Https
        get() = functions.https.unsafeCast<Https>()
}