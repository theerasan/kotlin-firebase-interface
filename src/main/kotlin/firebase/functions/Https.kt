package firebase.functions

import express.ExpressApp

external interface Https {
    fun onRequest(handler: ExpressApp)
}