package firebase.storage

import kotlin.js.Promise

external interface Reference {
    val bucket: String
    val fullPath: String
    val name: String
    val parent: Reference?
    val root: Reference?
    val storage: Storage?

    fun child(path: String): Reference
    fun delete(): Promise<Any?>
    fun getDownloadURL(): Promise<String>
    fun getMetadata(): Promise<FullMetadata>
    fun put (data: dynamic): Promise<UploadTask>
    fun put (data: dynamic, metadata: UploadMetadata): Promise<UploadTask>
    fun putString(data: String): Promise<UploadTask>
    fun putString(data: String, format: StringFormat): Promise<UploadTask>
    fun putString(data: String, metadata: UploadMetadata): Promise<UploadTask>
    fun putString(data: String, format: StringFormat, metadata: UploadMetadata): Promise<UploadTask>
    fun updateMetadata(metadata: SettableMetadata): Promise<FullMetadata>
}