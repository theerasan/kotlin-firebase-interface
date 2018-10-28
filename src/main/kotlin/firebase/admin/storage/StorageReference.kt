package firebase.admin.storage

import kotlin.js.Promise

external interface StorageReference {
    val bucket: String
    val fullPath: String
    val name: String
    val parent: String?
    val root: StorageReference
    val storage: Storage

    fun child(path: String): StorageReference
    fun delete(): Promise<Any?>
    fun getDownloadURL(): Promise<String>
    fun getMetadata(): Promise<FullMetadata>
    fun put(data: Any): UploadTask
    fun put(data: Any, metadata: UploadMetadata): UploadTask
    fun putString(data: String): UploadTask
    fun putString(data: String, formatString: StringFormat): UploadTask
    fun putString(data: String, metadata: UploadMetadata): UploadTask
    fun putString(data: String, formatString: StringFormat, metadata: UploadMetadata): UploadTask
    fun updateMetadata(metadata: SettableMetadata): Promise<FullMetadata>
}