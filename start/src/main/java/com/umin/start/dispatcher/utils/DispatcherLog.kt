package com.umin.start.dispatcher.utils

import android.util.Log
import com.umin.start.BuildConfig

object DispatcherLog {
    var isDebug = BuildConfig.DEBUG
    fun i(msg: String?) {
        if (!isDebug) {
            return
        }
        Log.i("task", msg!!)
    }
}