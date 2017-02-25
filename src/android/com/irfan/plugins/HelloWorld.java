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
	public boolean execute(String action, String args, final CallbackContext callbackContext) throws JSONException {
	        Log.i("KIRANCSE","execute() - START");
			if ( action.equals(ACTION_SHOW_EVENT) ) {
		        Log.i("KIRANCSE","execute() - inside if");
				this.show(args,callbackContext);
				return true;
			}
        Log.i("KIRANCSE","execute() - outside if");

/*
		CharSequence text = "This is my first cordova plugin";
		int duration = Toast.LENGTH_SHORT;

		Toast toast = Toast.makeText(cordova.getActivity().getApplicationContext(), args.toString(), duration);
		toast.show();
*/
		return false;
	}

	private void show(String message, CallbackContext callbackContext) {
	        Log.i("KIRANCSE","show() - START");
        Log.i("KIRANCSE","show() - message received = "+message);
        Log.i("KIRANCSE","show() - if result - "+message.equals("Test"));
		if (message.equals("Test") == true) {
	        Log.i("KIRANCSE","show() - Inside if");
		    callbackContext.success(message);
		} else {
	        Log.i("KIRANCSE","show() - Inside else");
		    callbackContext.error("Expected one non-empty string argument.");
		}		
	}
}
