package firebase.admin.firestore

import firebase.admin.Admin

external interface GeoPoint {
    val admin: Admin
    fun build(latitude: Float, longitude: Float): dynamic
}