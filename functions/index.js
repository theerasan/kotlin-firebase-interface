(function (_, Kotlin) {
  'use strict';
  var Kind_CLASS = Kotlin.Kind.CLASS;
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
  Kotlin.defineModule('index', _);
  return _;
}(module.exports, require('kotlin')));
