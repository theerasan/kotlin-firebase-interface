package firebase.admin.storage

external interface Storage {
    val app: Any
    val maxOperationRetryTime: Double
    val maxUploadRetryTime: Double
    fun ref(path: String): StorageReference
    fun ref(): StorageReference
    fun refFromURL(url: String): StorageReference
    fun setMaxOperationRetryTime(time: Double)
    fun setMaxUploadRetryTime(time: Double)
}