package firebase.admin

external interface UpdateRequest {
    val disabled: Boolean?
    val displayName: String?
    val email: String?
    val emailVerified: Boolean?
    val password: String?
    val phoneNumber: String?
    val photoURL: String?
    val uid: String?
}