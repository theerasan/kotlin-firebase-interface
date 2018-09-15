package express

import firebase.functions.Https

external interface Express {
    val express: dynamic
    val api: ExpressApp
}