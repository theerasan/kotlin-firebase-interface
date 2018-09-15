(function (_, Kotlin) {
  'use strict';
  var Unit = Kotlin.kotlin.Unit;
  var throwCCE = Kotlin.throwCCE;
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
    var firebaseApp = new FirebaseApp(require('firebase-admin'), require('firebase-functions'));
    var functions = firebaseApp.functions;
    var admin = firebaseApp.admin;
    admin.initializeApp(functions.config().firebase);
    var express = new Express(require('express'));
    var api = express.api;
    api.get('', main$lambda);
    api.post('/song/', main$lambda_0);
    api.put('/song/', main$lambda_1);
    api.delete('/song/:id', main$lambda_2);
    exports.helloWorld = firebaseApp.https.onRequest(api);
    admin.firestore().settings({timestampsInSnapshots: true});
    var firestore = Kotlin.isType(tmp$ = admin.firestore(), Object) ? tmp$ : throwCCE();
  }
  function Express(express) {
    this.express_0 = express;
    this.api = this.express_0();
  }
  Express.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'Express',
    interfaces: []
  };
  function asModel($receiver) {
    return JSON.parse(JSON.stringify($receiver));
  }
  function FirebaseApp(adminJS, functionsJS) {
    this.adminJS_0 = adminJS;
    this.functionsJS_0 = functionsJS;
    this.functions = this.functionsJS_0;
    this.admin = this.adminJS_0;
    this.https = this.functions.https;
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
  var package$express = _.express || (_.express = {});
  package$express.Express = Express;
  var package$extention = _.extention || (_.extention = {});
  package$extention.asModel_th5c7u$ = asModel;
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
