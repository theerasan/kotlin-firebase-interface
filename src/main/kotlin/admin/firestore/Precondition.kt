package admin.firestore

/**
 * An options object that configures conditional behavior of update() and delete() calls
 * in DocumentReference, WriteBatch, and Transaction. Using Preconditions, these calls
 * can be restricted to only apply to documents that match the specified conditions.
 *
 * @see <a href="https://cloud.google.com/nodejs/docs/reference/firestore/0.10.x/global#Precondition">Precondition</a>
 */
external interface Precondition