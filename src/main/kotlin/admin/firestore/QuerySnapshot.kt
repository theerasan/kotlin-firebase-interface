package admin.firestore

/**
 * A QuerySnapshot contains zero or more DocumentSnapshot objects representing the results of a query.
 * The documents can be accessed as an array via the documents property or enumerated using the forEach method.
 * The number of documents can be determined via the empty and size properties.
 *
 * @see <a href="https://cloud.google.com/nodejs/docs/reference/firestore/0.10.x/QuerySnapshot">QuerySnapshot</a>
 */
external interface QuerySnapshot {
    val docChanges: Array<DocumentChange>
    val docs: Array<DocumentSnapshot>
    val empty: Boolean
    val metaata: dynamic
    val size: Int
    fun forEach(callback: (DocumentSnapshot) -> Unit, thisArg: Any? = definedExternally)
}