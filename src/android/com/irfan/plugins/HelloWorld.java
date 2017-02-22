package com.irfan.plugins;

import android.os.*;
import org.apache.cordova.*;
import android.widget.Toast;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class HelloWorld extends CordovaPlugin {

	private static final String ACTION_SHOW_EVENT = "show";

	@Override
	public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {
		CharSequence text = "This is my first cordova plugin";
		int duration = Toast.LENGTH_SHORT;

		Toast toast = Toast.makeText(cordova.getActivity().getApplicationContext(), text, duration);
		toast.show();

		return true;
	}

}
