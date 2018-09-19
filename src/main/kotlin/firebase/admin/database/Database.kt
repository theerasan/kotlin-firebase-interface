package firebase.admin.database

external interface Database {
    val app: dynamic
    fun goFooline()
    fun goOnline()
    fun ref(path: String): Reference
    fun refFromURL(url: String): Reference
}