package firebase.storage

external interface UploadMetadata {
    val cacheControl: String?
    val contentDisposition: String?
    val contentEncoding: String?
    val contentLanguage: String?
    val contentType: String?
    val customMetadata: dynamic
    val md5Hash: String?
}