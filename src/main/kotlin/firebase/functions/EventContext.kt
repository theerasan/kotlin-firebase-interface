package firebase.functions

external interface EventContext {
    val auth: String?
    val eventId: String?
    val eventType: String?
    val params: dynamic
    val resource: String?
    val timestamp: String?
}