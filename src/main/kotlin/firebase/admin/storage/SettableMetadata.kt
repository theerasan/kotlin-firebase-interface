package firebase.admin.storage

external interface SettableMetadata {
    val cacheControl: String?
    val contentDisposition: String?
    val contentEncoding: String?
    val contentLanguage: String?
    val contentType: String?
    val customMetadata: Any?
}