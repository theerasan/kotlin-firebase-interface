package firebase

import firebase.admin.UserRecord

external interface ListUsersResult {
    val pageToken: String?
    val users: List<UserRecord>?
}