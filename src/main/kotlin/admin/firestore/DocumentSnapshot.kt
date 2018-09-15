package admin.firestore

/**
 * A DocumentSnapshot is an immutable representation for a document in a Firestore database.
 * The data can be extracted with data() or get(fieldPath) to get a specific field.
 *
 * The snapshot can point to a non-existing document in which case exists will return false.
 * Calling data() or get(fieldPath) for such a document throws an error.
 *
 * @see <a href="https://cloud.google.com/nodejs/docs/reference/firestore/0.10.x/DocumentSnapshot">DocumentSnapshot</a>
 */
external interface DocumentSnapshot {
    val createTime: String
    val exists: Boolean
    val id: String
    val readTime: String
    val ref: DocumentReference
    val updateTime: String
    fun <T> data(): T
    fun get(field: String): Any
}