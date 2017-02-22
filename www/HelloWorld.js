function HelloWorld() {
}


HelloWorld.prototype.show = function (message, successCallback, errorCallback) {
  this.show(message, "long", "bottom", successCallback, errorCallback);
};

HelloWorld.install = function () {
  if (!window.plugins) {
    window.plugins = {};
  }

  window.plugins.helloworld = new HelloWorld();
  return window.plugins.helloworld;
};

cordova.addConstructor(HelloWorld.install);