package firebase.admin.storage

external interface StorageObject {
    val bucket: String
    val cacheControl: String?
    val componentCount: Int?
    val contentDisposition: String?
    val contentEncoding: String?
    val contentLanguage: String?
    val contentType: String?
    val crc32c: String?
    val customerEncryption: Any?
    val generation: String?
    val id: String
    val kind: String
    val md5Hash: String?
    val mediaLink: String?
    val metadata: Any?
    val metageneration: String?
    val name: String?
    val selfLink: String?
    val size: String?
    val storageClass: String?
    val timeCreated: String?
    val timeDeleted: String?
    val updated: String?
}