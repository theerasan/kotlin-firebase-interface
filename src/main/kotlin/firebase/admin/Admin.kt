package firebase.admin

external interface Admin {
    val name: String
    fun initializeApp(): Admin
    fun initializeApp(config: dynamic): Admin
    fun initializeApp(config: dynamic, name: String): Admin
    fun database()
}