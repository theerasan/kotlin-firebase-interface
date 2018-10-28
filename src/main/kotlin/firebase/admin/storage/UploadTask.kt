package firebase.admin.storage

import kotlin.js.Promise

external interface UploadTask {
    val snapshot: UploadTaskSnapshot

    fun cancel(): Boolean
    fun catch(): Promise<Any>
    fun on(event: String): Promise<Any>
    fun on(event: String, next: (UploadTaskSnapshot) -> Unit): Promise<Any>
    fun on(event: String, next: (UploadTaskSnapshot) -> Unit, complete: () -> Unit): Promise<Any>
    fun on(event: String, next: (UploadTaskSnapshot) -> Unit, error: (Any) -> Unit, complete: () -> Unit): Promise<Any>
    fun on(event: String, error: (Any) -> Unit): Promise<Any>
    fun on(event: String, error: (Any) -> Unit, complete: () -> Unit): Promise<Any>
    fun on(event: String, complete: () -> Unit): Promise<Any>

    fun pause(): Boolean
    fun resume(): Boolean
    fun then(): Promise<Any>
    fun then(snapshot: UploadTaskSnapshot): Promise<Any>
    fun then(onReject: () -> Unit): Promise<Any>
    fun then(snapshot: UploadTaskSnapshot, onReject: () -> Unit): Promise<Any>
}