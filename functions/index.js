(function (_, Kotlin) {
  'use strict';
  var throwCCE = Kotlin.throwCCE;
  var Kind_CLASS = Kotlin.Kind.CLASS;
  function main$lambda(f, res) {
    return res.status(200).send('Hello world');
  }
  function main(args) {
    var tmp$;
    var functions = require('firebase-functions');
    var admin = require('firebase-admin');
    admin.initializeApp(functions.config().firebase);
    var express = require('express');
    var api = express();
    api.get('', main$lambda);
    exports.helloWorld = functions.https.onRequest(api);
    admin.firestore().settings({timestampsInSnapshots: true});
    var firestore = Kotlin.isType(tmp$ = admin.firestore(), Object) ? tmp$ : throwCCE();
  }
  function GeoPoint(admin) {
    this.admin = admin;
  }
  GeoPoint.prototype.build_dleff0$ = function (latitude, longitude) {
    var admin = this.admin;
    return new admin.firestore.GeoPoint(latitude, longitude);
  };
  GeoPoint.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'GeoPoint',
    interfaces: []
  };
  _.main_kand9s$ = main;
  var package$admin = _.admin || (_.admin = {});
  var package$firestore = package$admin.firestore || (package$admin.firestore = {});
  package$firestore.GeoPoint = GeoPoint;
  main([]);
  Kotlin.defineModule('index', _);
  return _;
}(module.exports, require('kotlin')));
