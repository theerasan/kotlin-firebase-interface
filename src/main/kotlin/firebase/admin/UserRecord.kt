package firebase.admin

import firebase.UserMetadata

external interface UserRecord {
    val customClaims: dynamic
    val disabled: Boolean?
    val displayName: String?
    val email: String?
    val emailVerified: Boolean?
    val metadata: UserMetadata
    val passwordHash: String?
    val passwordSalt: String?
    val phoneNumber: String?
    val photoURL: String?
    val providerData: List<UserInfo>
    val tokensValidAfterTime: String
    val uid: String?
}