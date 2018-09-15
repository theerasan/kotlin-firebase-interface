(function (_, Kotlin) {
  'use strict';
  var Unit = Kotlin.kotlin.Unit;
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
    res.status(200).send('SongExample titled ' + song.title + ' by ' + song.artist + ' has been created');
    return Unit;
  }
  function main$lambda_2(req, res) {
    var tmp$;
    var id = (tmp$ = req.param('id')) != null ? tmp$ : '';
    res.status(200).send('SongExample id ' + id + ' has been deleted');
    return Unit;
  }
  function main(args) {
    var firebaseApp = new FirebassAppExample(require('firebase-admin'), require('firebase-functions'));
    var functions = firebaseApp.functions;
    var admin = firebaseApp.admin;
    admin.initializeApp(functions.config().firebase);
    var express = new ExpressExample(require('express'));
    var api = express.api;
    api.get('', main$lambda);
    api.post('/song/', main$lambda_0);
    api.put('/song/', main$lambda_1);
    api.delete('/song/:id', main$lambda_2);
    exports.helloWorld = firebaseApp.https.onRequest(api);
  }
  function ExpressExample(express) {
    this.express_deks74$_0 = express;
  }
  Object.defineProperty(ExpressExample.prototype, 'express', {
    get: function () {
      return this.express_deks74$_0;
    }
  });
  Object.defineProperty(ExpressExample.prototype, 'api', {
    get: function () {
      return this.express();
    }
  });
  ExpressExample.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'ExpressExample',
    interfaces: []
  };
  function asModel($receiver) {
    return JSON.parse(JSON.stringify($receiver));
  }
  function FirebassAppExample(admin, functions) {
    this.admin_a2tnkc$_0 = admin;
    this.functions_gq6jhk$_0 = functions;
  }
  Object.defineProperty(FirebassAppExample.prototype, 'admin', {
    get: function () {
      return this.admin_a2tnkc$_0;
    }
  });
  Object.defineProperty(FirebassAppExample.prototype, 'functions', {
    get: function () {
      return this.functions_gq6jhk$_0;
    }
  });
  Object.defineProperty(FirebassAppExample.prototype, 'https', {
    get: function () {
      return this.functions.https;
    }
  });
  FirebassAppExample.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'FirebassAppExample',
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
  function SongExample(title, artist, album, duration) {
    this.title = title;
    this.artist = artist;
    this.album = album;
    this.duration = duration;
  }
  SongExample.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'SongExample',
    interfaces: []
  };
  _.main_kand9s$ = main;
  var package$express = _.express || (_.express = {});
  package$express.ExpressExample = ExpressExample;
  var package$extention = _.extention || (_.extention = {});
  package$extention.asModel_th5c7u$ = asModel;
  var package$firebase = _.firebase || (_.firebase = {});
  package$firebase.FirebassAppExample = FirebassAppExample;
  var package$admin = package$firebase.admin || (package$firebase.admin = {});
  var package$firestore = package$admin.firestore || (package$admin.firestore = {});
  package$firestore.GeoPoint = GeoPoint;
  var package$model = _.model || (_.model = {});
  package$model.SongExample = SongExample;
  main([]);
  Kotlin.defineModule('index', _);
  return _;
}(module.exports, require('kotlin')));
