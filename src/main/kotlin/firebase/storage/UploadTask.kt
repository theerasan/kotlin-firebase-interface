package firebase.storage

import kotlin.js.Promise

external interface UploadTask {
    val snapshot: UploadTaskSnapshot

    fun cancel(): Boolean
    fun catch(reject: dynamic): Promise<Any?>
    fun on(event: TaskEvent): Promise<Any?>
    fun on(event: TaskEvent, nextOrObserver: () -> Unit): Promise<Any?>
    fun pause(): Boolean
    fun resume(): Boolean
    fun then(): Promise<Any>
    fun then(onFulfilled: UploadTaskSnapshot): Promise<Any>
    fun then(onRejected: dynamic): Promise<Any>
    fun then(onFulfilled: UploadTaskSnapshot, onRejected: dynamic): Promise<Any>
}