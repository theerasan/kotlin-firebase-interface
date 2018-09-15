package firebase.admin.firestore

class GeoPoint(val admin: dynamic) {
    fun build(latitude: Float, longitude: Float): dynamic {
        val admin = this.admin
        return js(code = "new firebase.admin.firestore.GeoPoint(latitude, longitude)")
    }
}