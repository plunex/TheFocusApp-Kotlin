package com.plunex.thefocusapp

import android.content.Context
import android.content.SharedPreferences

class AppPrefs (context: Context) {

    private var prefs: SharedPreferences
    private var prefsEditor: SharedPreferences.Editor
    private var defaultFocus : String = ""

    init {
        prefs = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE)
        prefsEditor = prefs.edit()
        defaultFocus = context.resources.getString(R.string.default_focus)
    }

    fun setFocus(focus: String) {
        prefsEditor.putString(FOCUS, focus)
        prefsEditor.commit()
    }

    fun getFocus(): String? = prefs.getString(FOCUS, defaultFocus)

    companion object {
        private const val PRIVATE_MODE = 0
        private const val PREF_NAME = "app-prefs"
        private const val FOCUS = "Focus"
    }
}