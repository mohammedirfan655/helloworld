package com.irfan.plugins;

import android.os.*;
import org.apache.cordova.*;
import android.widget.Toast;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import android.util.Log;

public class HelloWorld extends CordovaPlugin {

	private static final String ACTION_SHOW_EVENT = "show";

	@Override
	public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {
			if ( action.equals(ACTION_SHOW_EVENT) ) {
				show(args.toString(),callbackContext);
				return true;
			}

/*
		CharSequence text = "This is my first cordova plugin";
		int duration = Toast.LENGTH_SHORT;

		Toast toast = Toast.makeText(cordova.getActivity().getApplicationContext(), args.toString(), duration);
		toast.show();
*/
		return false;
	}

	private void show(String message, CallbackContext callbackContext) {
		if (message != null && message.length() > 0) {
		    callbackContext.success(message);
		} else {
		    callbackContext.error("Expected one non-empty string argument.");
		}		
	}
}
