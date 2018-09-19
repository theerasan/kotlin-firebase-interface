package firebase.admin.database

external interface Change {
    val after: DataSnapshot
    val before: DataSnapshot
}