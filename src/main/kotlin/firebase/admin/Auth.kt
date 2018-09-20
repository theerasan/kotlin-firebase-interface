package firebase.admin

import firebase.ListUsersResult
import firebase.UserImportOptions
import firebase.UserImportRecord
import kotlin.js.Promise

external interface Auth {
    val app: dynamic

    fun createCustomToken(uid: String): Promise<String>
    fun createCustomToken(uid: String, developerClaims: dynamic): Promise<String>
    fun createSessionCookie(idToken: String, sessionCookieOptions: SessionCookieOptions): Promise<String>
    fun createUser(properties: CreateRequest): Promise<UserRecord>
    fun deleteUser(uid: String): Promise<Any?>
    fun getUser(uid: String): Promise<UserRecord>
    fun getUserByEmail(email: String): Promise<UserRecord>
    fun getUserByPhoneNumber(phoneNumber: String): Promise<UserRecord>
    fun importUser(userImportRecords: List<UserImportRecord>): Promise<Any?>
    fun importUser(userImportRecords: List<UserImportRecord>, userImportOptions: UserImportOptions): Promise<Any?>
    fun listUsers(): Promise<ListUsersResult>
    fun listUsers(maxResults: Int): Promise<ListUsersResult>
    fun listUsers(maxResults: Int, pageToken: String): Promise<ListUsersResult>
    fun revokeRefreshTokens(uid: String): Promise<Any?>
    fun setCustomUserClaims(uid: String, customUserClaims: dynamic): Promise<Any?>
    fun updateUser(uid: String, properties: UpdateRequest): Promise<UserRecord>
    fun verifyIdToken(idToken: String): Promise<DecodedIdToken>
    fun verifyIdToken(idToken: String, checkRevoked: Boolean): Promise<DecodedIdToken>
    fun verifySessionCookie(sessionCookie: String): Promise<DecodedIdToken>
    fun verifySessionCookie(sessionCookie: String, checkRevoked: Boolean): Promise<DecodedIdToken>
}