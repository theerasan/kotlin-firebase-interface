package firebase.admin.database

import kotlin.js.Promise

external interface OnDisconnect {
    fun cancel(): Promise<Nothing>
    fun remove(): Promise<Nothing>
    fun set(): Promise<Nothing>
    fun setWithPriority(value: Any, newPriority: Any): Promise<Nothing>
    fun update(value: Any): Promise<Nothing>
}