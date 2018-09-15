# Kotlin-Firebase-Interface
Let wrap the firebase admin to work perfectly with Kotlin

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
### Lastest version 1.0.4-alpha
* Include express
* Include firestore
* Still in development and testing.

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

### Run your functions on local enviralment
```
$ firebase serve
```
Not taking so long, the local url of your services will show up in your terminal.
Click the url for ex. [http://localhost:5000/kotlin-firebase-interface/us-central1/helloWorld](http://localhost:5000/kotlin-firebase-interface/us-central1/helloWorld) You'll see your functions work here.

### Implementing the interface
* [x] [firestore](https://firebase.google.com/docs/reference/js/firebase.firestore)
* [ ] [database](https://firebase.google.com/docs/reference/js/firebase.database)
* [ ] [functions](https://firebase.google.com/docs/reference/js/firebase.functions)
* [ ] [storage](https://firebase.google.com/docs/reference/js/firebase.storage)
* [ ] [admin](https://firebase.google.com/docs/reference/admin/node/)
* [x] [express](https://expressjs.com/en/4x/api.html) only handle https requiest 
