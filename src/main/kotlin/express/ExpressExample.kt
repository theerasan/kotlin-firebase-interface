package express
class ExpressExample(override val express: dynamic) : Express {
    override val api: ExpressApp
        get() = express().unsafeCast<ExpressApp>()
}