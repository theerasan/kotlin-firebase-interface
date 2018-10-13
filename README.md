# Kotlin-Firebase-Interface
Let wrap the firebase admin to work perfectly with Kotlin

[![](https://jitpack.io/v/theerasan/kotlin-firebase-interface.svg)](https://jitpack.io/#theerasan/kotlin-firebase-interface)

## Developer description
This project still in development process but you can check the depedencies [here](https://jitpack.io/#theerasan/kotlin-firebase-interface) 

### Install

```
repositories {
   ...
   maven { url 'https://jitpack.io' }
}

dependencies {
   ...
   implementation "com.github.theerasan:kotlin-firebase-interface:version"
}
```
### Get start
Implement Express interface

```
class ExpressImpl : Express {
    override val express: dynamic
        get() = require("express")
    override val api: ExpressApp
        get() = express().unsafeCast<ExpressApp>()
}
```

Implement Firebase App interface

```
class FirebassAppImpl : FirebaseApp {
    override val admin = require("firebase-admin").unsafeCast<Admin>()
    override val functions = require("firebase-functions")
    override val config: Config = functions.config().unsafeCast<Config>()
    override val https: Https = functions.https.unsafeCast<Https>()
    override val database: Database
        get() = admin.asDynamic().database().unsafeCast<Database>()
    override val functionsDatabase = functions.database.unsafeCast<Database>()
    override val firestore: Firestore
        get() = admin.asDynamic().firestore().unsafeCast<Firestore>()
    override val auth: Auth
            get() = admin.asDynamic().auth().unsafeCast<Auth>()
}
```

Your Index.kt file

```
val firebaseApp = FirebassAppImpl()
val admin = firebaseApp.admin
val config = firebaseApp.config
admin.initializeApp(config.firebase)
val database = firebaseApp.database

val express = ExpressImpl()
val api = express.api
```

### Latest version 1.0.2
* Stable enough.

## Contributor description

### Installation
- Make sure you install npm first [read more](https://www.npmjs.com/)
- Install dependency in the project
```
$ npm install
```
- Install dependency in functions
```
$ cd functions
functions $ npm install
functions $ cd ..
$
```

### Run your functions on local environment
```
$ firebase serve
```
Not taking so long, the local url of your services will show up in your terminal.
Click the url for ex. [http://localhost:5000/kotlin-firebase-interface/us-central1/helloWorld](http://localhost:5000/kotlin-firebase-interface/us-central1/helloWorld) You'll see your functions work here.

### Implementing the interface (version 1.0.0)
* [x] [firestore](https://firebase.google.com/docs/reference/js/firebase.firestore)
* [x] [database](https://firebase.google.com/docs/reference/js/firebase.database)
* [x] [functions](https://firebase.google.com/docs/reference/js/firebase.functions)
* [x] [storage](https://firebase.google.com/docs/reference/js/firebase.storage)
* [x] [admin](https://firebase.google.com/docs/reference/admin/node/)
* [x] [express](https://expressjs.com/en/4x/api.html) only handle https request
* [x] [Realtime Database triggers](https://firebase.google.com/docs/functions/database-events)
* [x] [Cloud Firestore triggers](https://firebase.google.com/docs/functions/firestore-events)
* [x] [GeoPoint](https://firebase.google.com/docs/reference/android/com/google/firebase/firestore/GeoPoint) for Firestore
* [x] [Realtime Database Query](https://firebase.google.com/docs/reference/android/com/google/firebase/database/Query)
* [ ] [Firestore Query](https://firebase.google.com/docs/reference/android/com/google/firebase/firestore/Query)
