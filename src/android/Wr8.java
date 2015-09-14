package com.wr8.plugin;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class Wr8 extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("echo")) {
            String name = data.getString(0);
            String message = "Hello from java isside of plugin!, " + name;
            callbackContext.success(message);
            return true;

        } 
        else if (action.equals("init")) {
            callbackContext.success("WaterR8 Dongle Initialization success!");
            return true;
        } else {
            return false;
        }
    }
}
