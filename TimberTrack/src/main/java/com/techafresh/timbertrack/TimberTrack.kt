package com.techafresh.timbertrack

import android.content.Context
import android.util.Log
import android.widget.Toast

object TimberTrack {
    fun log( message : String? = "Default Log Message", tag : String = "Timber-Track", context : Context? = null, showToast : Boolean = false, toastLength : Int = Toast.LENGTH_LONG){
        if (message != null) {
            Log.d(tag , message)
            if (showToast && context != null){
                Toast.makeText(context,  message, toastLength).show()
            }
        }
    }
}