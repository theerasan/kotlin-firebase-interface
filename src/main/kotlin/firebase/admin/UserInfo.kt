package firebase.admin

external interface UserInfo {
    val displaName: String?
    val email: String
    val phoneNumber: String
    val photoUrl: String?
    val providerId: String
    val uid: String
}
