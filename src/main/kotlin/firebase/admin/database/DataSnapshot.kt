package firebase.admin.database

external interface DataSnapshot {
    val key: String?
    val ref: Reference

    fun child(path: String): DataSnapshot
    fun exists(): Boolean
    fun exportVal(): Any
    fun forEach(childSnapshot: (DataSnapshot) -> Unit): Boolean
    fun getPriority(): Any?
    fun hasChild(): Boolean
    fun hasChildren(): Boolean
    fun numChildren(): Int
    fun toJSON(): dynamic
    fun <T> `val`(): T
}