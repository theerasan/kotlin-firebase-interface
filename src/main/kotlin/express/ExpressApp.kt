package express

external interface ExpressApp {
    fun get(path: String, functions: (Request, Response) -> Unit)
}