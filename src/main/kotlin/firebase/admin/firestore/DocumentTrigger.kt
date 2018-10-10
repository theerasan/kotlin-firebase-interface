package firebase.admin.firestore

import firebase.functions.EventContext

external interface DocumentTrigger {
    fun onCreate(callback: (DocumentSnapshot, EventContext) -> Unit)
    fun onWrite(callback: (DocumentChange, EventContext) -> Unit)
    fun onUpdate(callback: (DocumentChange, EventContext) -> Unit)
    fun onDelete(callback: (DocumentSnapshot, EventContext) -> Unit)
}