function HelloWorld() {
}


HelloWorld.prototype.show = function (message, successCallback, errorCallback) {
	cordova.exec(successCallback, errorCallback, "HelloWorld", "show", message);
};

HelloWorld.install = function () {
  if (!window.plugins) {
    window.plugins = {};
  }

  window.plugins.helloworld = new HelloWorld();
  return window.plugins.helloworld;
};

cordova.addConstructor(HelloWorld.install);