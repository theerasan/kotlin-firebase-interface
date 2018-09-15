package express

external interface Response {
    val app: dynamic
    val locals: dynamic
    val headersSent: Boolean

    fun append(key: String, value: String)
    fun append(key: String, vararg values: String)
    fun attachment()
    fun attachment(fileName: String)
    fun cookie(name: String, value: String)
    fun cookie(name: String, value: String, vararg options: String)
    fun clearCookie(name: String)
    fun clearCookie(name: String, options: dynamic)
    fun download(url: String)
    fun download(url: String, fileName: String)
    fun download(url: String, fileName: String, err: (dynamic) -> Unit)
    fun end()
    fun format(obj: dynamic)
    fun get(key: String): String
    fun json(json: dynamic)
    fun jsonp(json: dynamic)
    fun link(json: dynamic)
    fun location(navigate: String)
    fun redirect(url: String)
    fun redirect(port:Int, url: String)
    fun render(text: String)
    fun render(text: String, obj: dynamic)
    fun render(text: String, obj: dynamic, err:(dynamic, dynamic) -> Unit)
    fun send(pack: Any)
    fun sendFile(path: String)
    fun sendFile(path: String, options: dynamic)
    fun sendFile(path: String, options: dynamic, err: (dynamic) -> Unit)
    fun sendStatus(code: Int)
    fun set(key: String, value: String)
    fun set(options: dynamic)
    fun status(code: Int): Response
    fun type(type: String)
    fun vary(key: String): Response
}