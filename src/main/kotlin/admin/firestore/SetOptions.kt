package admin.firestore

/**
 * An options object that configures the behavior of set() calls in DocumentReference,
 * WriteBatch, and Transaction. These calls can be configured to perform granular merges
 * instead of overwriting the target documents in their entirety by providing a SetOptions object with { merge : true }.
 *
 * @see <a href="https://cloud.google.com/nodejs/docs/reference/firestore/0.10.x/global#SetOptions">SetOptions</a>
 */
external interface SetOptions