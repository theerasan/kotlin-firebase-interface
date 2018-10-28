package firebase.admin.storage

external interface UploadMetadata {
    val cacheControl: dynamic
    val contentDisposition: dynamic
    val contentEncoding: dynamic
    val contentLanguage: dynamic
    val contentType: dynamic
    val customMetadata: dynamic
    val md5Hash: String?
}