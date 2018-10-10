package firebase.admin.firestore

external interface FirestoreTrigger {
    fun document(path: String): DocumentTrigger
}