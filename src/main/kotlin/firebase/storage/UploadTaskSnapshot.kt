package firebase.storage

external interface UploadTaskSnapshot {
    val bytesTransferred: Long
    val metadata: FullMetadata
    val ref: Reference
    val state: TaskState
    val task: UploadTask
    val totalBytes: Long
}