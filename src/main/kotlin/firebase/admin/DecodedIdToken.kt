package firebase.admin

external interface DecodedIdToken {
    val aud: String
    val auth_time: Long
    val exp: Long
    val firebase: dynamic
    val iat: Long
    val iss: String
    val sub: String
    val uid: String
}