package express

import require

class ExpressExample : Express {
    override val express: dynamic
        get() = require("express")
    override val api: ExpressApp
        get() = express().unsafeCast<ExpressApp>()
}