package firebase.admin.storage

import firebase.functions.EventContext

external interface StorageTrigger {
    fun onArchive(handlers: (StorageObject) -> Unit): dynamic
    fun onArchive(handlers: (StorageObject) -> Unit, eventContext: EventContext): dynamic

    fun onDelete(handlers: (StorageObject) -> Unit): dynamic
    fun onDelete(handlers: (StorageObject) -> Unit, eventContext: EventContext): dynamic

    fun onFinalize(handlers: (StorageObject) -> Unit): dynamic
    fun onFinalize(handlers: (StorageObject) -> Unit, eventContext: EventContext): dynamic

    fun onMetadataUpdate(handlers: (StorageObject) -> Unit): dynamic
    fun onMetadataUpdate(handlers: (StorageObject) -> Unit, eventContext: EventContext): dynamic
}