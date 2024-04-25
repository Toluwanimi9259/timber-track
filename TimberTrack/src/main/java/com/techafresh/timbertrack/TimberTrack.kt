package com.techafresh.timbertrack

import android.content.Context
import android.util.Log
import android.widget.Toast

object TimberTrack {
    fun log(context : Context?, message : String?, showToast : Boolean = true){
        if (message != null) {
            Log.d("Logger" , message)
            if (showToast){
                Toast.makeText(context,  message, Toast.LENGTH_LONG).show()
            }
        }

    }
}