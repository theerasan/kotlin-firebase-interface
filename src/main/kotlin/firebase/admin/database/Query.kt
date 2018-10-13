package firebase.admin.database

import kotlin.js.Promise

external interface Query {
    val ref: Reference

    fun endAt(value: String, key: String?): Query
    fun endAt(value: Int, key: String?): Query
    fun equalTo(value: String, key: String?): Query
    fun equalTo(value: Int, key: String?): Query
    fun equalTo(value: Boolean, key: String?): Query
    fun endAt(value: String): Query
    fun endAt(value: Int): Query
    fun equalTo(value: String): Query
    fun equalTo(value: Int): Query
    fun equalTo(value: Boolean): Query
    fun isEqual(): Boolean
    fun limitToFirst(limit: Int): Query
    fun limitToLast(limit: Int): Query
    fun off(option: String): Promise<DataSnapshot>
    fun off(): Promise<DataSnapshot>
    fun on(eventType: String, callback: (DataSnapshot, String?) -> Unit): (DataSnapshot, String?) -> Unit
    fun once(eventType: String): Promise<DataSnapshot>
    fun orderByChild(path: String): Query
    fun orderByKey(): Query
    fun orderByPriority(): Query
    fun orderByValue(): Query
    fun startAt(index: Long): Query
    fun startAt(index: Long, key: String): Query
    fun startAt(value: String): Query
    fun startAt(value: Boolean): Query
    fun startAt(value: Boolean, key: String): Query
    fun toJSON(): dynamic
}