package firebase.admin.database

import firebase.functions.EventContext
import kotlin.js.Promise

external interface Reference {
    val key: String?
    val parent: Reference?
    val ref: Reference
    val root: Reference
    fun child(path: String): Reference
    fun endAt(value: String, key: String?): Query
    fun endAt(value: Int, key: String?): Query
    fun equalTo(value: String, key: String?): Query
    fun equalTo(value: Int, key: String?): Query
    fun equalTo(value: Boolean, key: String?): Query
    fun isEqual(): Boolean
    fun limitToFirst(limit: Int): Query
    fun limitToLast(limit: Int): Query
    fun off(option: String): Promise<DataSnapshot>
    fun on(eventType: String): Promise<DataSnapshot>
    fun once(eventType: String): Promise<DataSnapshot>
    fun onDisconnect(): OnDisconnect
    fun orderByChild(path: String): Query
    fun orderByKey(): Query
    fun orderByPriority(): Query
    fun orderByValue(): Query
    fun push(): ThenableReference
    fun push(value: Any): Promise<Any?>
    fun remove(): Promise<Any?>
    fun set(value: Any): Promise<Any?>
    fun setWithPriority(value: Any, newPriority: Any): Promise<Any?>
    fun startAt(index: Long): Query
    fun startAt(index: Long, key: String): Query
    fun startAt(value: String): Query
    fun startAt(value: Boolean): Query
    fun startAt(value: Boolean, key: String): Query
    fun toJSON(): dynamic
    fun transaction(currentData:(DataSnapshot) -> Unit, error: (Error, Boolean, DataSnapshot) -> Unit)
    fun update(value: Any): Promise<Any?>
    fun onCreate(callback: (DataSnapshot, EventContext) -> Unit)
    fun onWrite(callback: (Change, EventContext) -> Unit)
    fun onUpdate(callback: (Change, EventContext) -> Unit)
    fun onDelete(callback: (DataSnapshot, EventContext) -> Unit)
}