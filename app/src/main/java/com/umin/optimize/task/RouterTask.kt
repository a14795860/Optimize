package com.umin.optimize.task

import android.app.Application
import com.alibaba.android.arouter.launcher.ARouter
import com.umin.optimize.BuildConfig
import com.umin.start.dispatcher.Task

/**
 * @date：2021/8/11
 * @author fushiyao
 * @instruction：
 */
class RouterTask() : Task() {
    override fun run() {
        if (BuildConfig.DEBUG) {
            ARouter.openLog()
            ARouter.openDebug()
        }
        ARouter.init(mContext as Application?)
    }
}