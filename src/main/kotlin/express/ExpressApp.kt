package express

external interface ExpressApp {
    fun delete(path: String, functions: (Request, Response) -> Unit)
    fun disable(name: String)
    fun disabled(name: String): Boolean
    fun enable(name: String)
    fun enabled(name: String): Boolean
    fun get(name: String): dynamic
    fun get(path: String, functions: (Request, Response) -> Unit)
    fun get(path: String, functions: (Request, Response) -> Unit, vararg functionsArg: (Request, Response) -> Unit)
    fun listen(portNumber: Int)
    fun path(): String
    fun post(path: String, functions: (Request, Response) -> Unit)
    fun post(path: String, functions: (Request, Response) -> Unit, vararg functionsArg: (Request, Response) -> Unit)
    fun post(path: String, middleware: Any, callback: (Request, Response) -> Unit)
    fun put(path: String, functions: (Request, Response) -> Unit)
    fun put(path: String, functions: (Request, Response) -> Unit, vararg functionsArg: (Request, Response) -> Unit)
    fun put(path: String, middleware: Any, callback: (Request, Response) -> Unit)
    fun set(key: String, value: String)
    fun use(path: String, functions: (Request, Response) -> Unit)
    fun use(path: String, functions: (Request, Response, Unit) -> Unit)
    fun use(functions: (Request, Response) -> Unit)
    fun use(functions: (Request, Response, () -> Unit) -> Unit)
    fun use(any: Any)
}