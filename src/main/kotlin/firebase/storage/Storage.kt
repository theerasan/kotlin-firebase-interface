package firebase.storage

external interface Storage {
    val app: dynamic
    val maxOperationRetryTime: Long
    val maxUploadRetryTime: Int

    fun ref(path: String): Reference
    fun refFromURL(url: String): Reference
    fun setMaxOperationRetryTime(time: Long)
    fun setMaxUploadRetryTime(time: Int)
}