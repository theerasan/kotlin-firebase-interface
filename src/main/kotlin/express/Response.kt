package express

external interface Response {
    val app: dynamic
    val locals: dynamic
    val headersSent: Boolean

    fun status(code: Int): Response
    fun send(pack: Any)
}