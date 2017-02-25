function HelloWorld() {
}


HelloWorld.prototype.show = function (message, successCallback, errorCallback) {
	var options={"Name":"Irfan"};
	cordova.exec(successCallback, errorCallback, "HelloWorld", "show", [options]);
};

HelloWorld.install = function () {
  if (!window.plugins) {
    window.plugins = {};
  }

  window.plugins.helloworld = new HelloWorld();
  return window.plugins.helloworld;
};

cordova.addConstructor(HelloWorld.install);