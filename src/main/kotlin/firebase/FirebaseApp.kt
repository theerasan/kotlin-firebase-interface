package firebase

import firebase.admin.Admin
import firebase.admin.Auth
import firebase.admin.database.Database
import firebase.admin.firestore.Firestore
import firebase.admin.firestore.FirestoreTrigger
import firebase.functions.Config
import firebase.functions.Https

external interface FirebaseApp {
    val admin: Admin
    val database: Database
    val firestore: Firestore
    val functions: dynamic
    val https: Https
    val config: Config
    val databaseTriggers: Database
    val firestoreTrigger: FirestoreTrigger
    val auth: Auth
}