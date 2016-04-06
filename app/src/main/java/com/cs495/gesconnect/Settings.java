package com.cs495.gesconnect;

import android.content.SharedPreferences;
import android.content.Context;

public class Settings {
    public static String getSetting(Context context, String key) {
        SharedPreferences sharedPreferences
                = context.getSharedPreferences(preferencesFileName,
                                                0);

        // If the key doesn't exist, return an empty string
        return sharedPreferences.getString(key, "");
    }

    public static void setSetting(Context context, String key, String value) {
        SharedPreferences sharedPreferences
                = context.getSharedPreferences(preferencesFileName,
                0);

        SharedPreferences.Editor editor
            = sharedPreferences.edit();

        editor.putString(key, value);
    }

/*    public static GestureList getGestureList() {

    } */

    // String accessors for application settings
    final static public String vibrationEnabledString = "GesVibrationEnabled";

    // Predefined settings values
    final static public String trueString = "true";
    final static public String falseString = "false";

    // Name of the shared preference file the key/value pairs are stored to
    final static protected String preferencesFileName = "GesConnectPref";
}
