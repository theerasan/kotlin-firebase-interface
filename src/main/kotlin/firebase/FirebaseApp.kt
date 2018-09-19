package firebase

import firebase.admin.Admin
import firebase.admin.database.Database
import firebase.functions.Config
import firebase.functions.Https

external interface FirebaseApp {
    val admin: Admin
    val database: Database
    val functions: dynamic
    val https: Https
    val config: Config
    val functionsDatabase: Database
}