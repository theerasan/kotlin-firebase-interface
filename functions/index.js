(function (_, Kotlin) {
  'use strict';
  var Unit = Kotlin.kotlin.Unit;
  var throwCCE = Kotlin.throwCCE;
  var Kind_OBJECT = Kotlin.Kind.OBJECT;
  var Kind_CLASS = Kotlin.Kind.CLASS;
  function main$lambda(req, res) {
    var tmp$;
    res.status(200).send((tmp$ = req.param('nickName')) != null ? tmp$ : 'no params');
    return Unit;
  }
  function main$lambda_0(req, res) {
    var song = asModel(req.body);
    console.log(song);
    res.status(200).send(song);
    return Unit;
  }
  function main$lambda_1(req, res) {
    var song = asModel(req.body);
    console.log(song);
    res.status(200).send('Song titled ' + song.title + ' by ' + song.artist + ' has been created');
    return Unit;
  }
  function main$lambda_2(req, res) {
    var tmp$;
    var id = (tmp$ = req.param('id')) != null ? tmp$ : '';
    res.status(200).send('Song id ' + id + ' has been deleted');
    return Unit;
  }
  function main(args) {
    var tmp$;
    var functions = FirebaseApp$Companion_getInstance().functions;
    var admin = FirebaseApp$Companion_getInstance().admin;
    admin.initializeApp(functions.config().firebase);
    var api = Express$Companion_getInstance().api;
    api.get('', main$lambda);
    api.post('/song/', main$lambda_0);
    api.put('/song/', main$lambda_1);
    api.delete('/song/:id', main$lambda_2);
    exports.helloWorld = FirebaseApp$Companion_getInstance().https.onRequest(api);
    admin.firestore().settings({timestampsInSnapshots: true});
    var firestore = Kotlin.isType(tmp$ = admin.firestore(), Object) ? tmp$ : throwCCE();
  }
  function Express() {
    Express$Companion_getInstance();
  }
  function Express$Companion() {
    Express$Companion_instance = this;
    this.express_0 = require('express');
    this.api = this.express_0();
  }
  Express$Companion.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'Companion',
    interfaces: []
  };
  var Express$Companion_instance = null;
  function Express$Companion_getInstance() {
    if (Express$Companion_instance === null) {
      new Express$Companion();
    }
    return Express$Companion_instance;
  }
  Express.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'Express',
    interfaces: []
  };
  function asModel($receiver) {
    return JSON.parse(JSON.stringify($receiver));
  }
  function FirebaseApp() {
    FirebaseApp$Companion_getInstance();
  }
  function FirebaseApp$Companion() {
    FirebaseApp$Companion_instance = this;
    this.functions = require('firebase-functions');
    this.admin = require('firebase-admin');
    this.https = this.functions.https;
  }
  FirebaseApp$Companion.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'Companion',
    interfaces: []
  };
  var FirebaseApp$Companion_instance = null;
  function FirebaseApp$Companion_getInstance() {
    if (FirebaseApp$Companion_instance === null) {
      new FirebaseApp$Companion();
    }
    return FirebaseApp$Companion_instance;
  }
  FirebaseApp.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'FirebaseApp',
    interfaces: []
  };
  function GeoPoint(admin) {
    this.admin = admin;
  }
  GeoPoint.prototype.build_dleff0$ = function (latitude, longitude) {
    var admin = this.admin;
    return new firebase.admin.firestore.GeoPoint(latitude, longitude);
  };
  GeoPoint.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'GeoPoint',
    interfaces: []
  };
  function Song(title, artist, album, duration) {
    this.title = title;
    this.artist = artist;
    this.album = album;
    this.duration = duration;
  }
  Song.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'Song',
    interfaces: []
  };
  _.main_kand9s$ = main;
  Object.defineProperty(Express, 'Companion', {
    get: Express$Companion_getInstance
  });
  var package$express = _.express || (_.express = {});
  package$express.Express = Express;
  var package$extention = _.extention || (_.extention = {});
  package$extention.asModel_th5c7u$ = asModel;
  Object.defineProperty(FirebaseApp, 'Companion', {
    get: FirebaseApp$Companion_getInstance
  });
  var package$firebase = _.firebase || (_.firebase = {});
  package$firebase.FirebaseApp = FirebaseApp;
  var package$admin = package$firebase.admin || (package$firebase.admin = {});
  var package$firestore = package$admin.firestore || (package$admin.firestore = {});
  package$firestore.GeoPoint = GeoPoint;
  var package$model = _.model || (_.model = {});
  package$model.Song = Song;
  main([]);
  Kotlin.defineModule('index', _);
  return _;
}(module.exports, require('kotlin')));
