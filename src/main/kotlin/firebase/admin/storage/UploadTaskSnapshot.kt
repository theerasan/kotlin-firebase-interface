package firebase.admin.storage

external interface UploadTaskSnapshot {
    val bytesTransferred: Double
    val metadata: FullMetadata
    val ref: StorageReference
    val task: UploadTask
    val totalBytes: Double
}