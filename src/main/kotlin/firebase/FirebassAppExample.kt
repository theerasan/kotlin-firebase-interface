package firebase

import firebase.admin.Admin
import firebase.admin.Auth
import firebase.admin.database.Database
import firebase.admin.firestore.Firestore
import firebase.admin.firestore.FirestoreTrigger
import firebase.admin.storage.Storage
import firebase.functions.Config
import firebase.functions.Https
import require

class FirebassAppExample : FirebaseApp {
    override val admin = require("firebase-admin").unsafeCast<Admin>()
    override val functions = require("firebase-functions")
    override val config: Config = functions.config().unsafeCast<Config>()
    override val https: Https = functions.https.unsafeCast<Https>()
    override val database: Database
        get() = admin.asDynamic().database().unsafeCast<Database>()
    override val databaseTriggers = functions.database.unsafeCast<Database>()
    override val firestoreTrigger = functions.firestore.unsafeCast<FirestoreTrigger>()
    override val firestore: Firestore
        get() = admin.asDynamic().firestore().unsafeCast<Firestore>()
    override val auth: Auth
        get() = admin.asDynamic().auth().unsafeCast<Auth>()
    override val storage: Storage
        get() = admin.asDynamic().storage().bucket().unsafeCast<Storage>()
}