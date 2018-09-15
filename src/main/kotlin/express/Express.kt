package express

class Express(private val express: dynamic) {
    val api = express().unsafeCast<ExpressApp>()
}