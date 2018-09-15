package admin.firestore

/**
 * The Firestore client represents a Firestore Database and is the entry point for all Firestore operations.
 * @see <a href="https://cloud.google.com/nodejs/docs/reference/firestore/0.10.x/Firestore">Firestore</a>
 */
external interface Firestore {
    val app: dynamic //The app associated with this Firestore service instance
    fun batch(): WriteBatch //Creates a write batch, used for performing multiple writes as a single atomic operation
    fun collection(collectionPath: String): CollectionReference
}