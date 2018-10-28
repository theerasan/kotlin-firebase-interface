package firebase.admin.storage

external interface FullMetadata {
    val bucket: String
    val cacheControl: dynamic
    val contentDisposition: dynamic
    val contentEncoding: dynamic
    val contentLanguage: dynamic
    val contentType: dynamic
    val customMetadata: dynamic
    val fullPath: String
    val generation: String
    val md5Hash: dynamic
    val metageneration: String
    val name: String
    var size: Int
    var updated: String
}