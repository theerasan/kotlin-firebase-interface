package express
external fun require(module:String):dynamic

class Express {
    companion object {
        private val express = require("express")
        val api = express().unsafeCast<ExpressApp>()
    }
}