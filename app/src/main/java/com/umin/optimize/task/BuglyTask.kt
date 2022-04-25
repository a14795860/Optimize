package com.umin.optimize.task

import com.umin.start.dispatcher.Task
import com.tencent.bugly.Bugly

/**
 * @date：2021/8/11
 * @author fushiyao
 * @instruction：
 */
class BuglyTask : Task() {

    override fun dependsOn(): List<Class<out Task?>?>? {
        return super.dependsOn()
    }

    override fun run() {
        Bugly.init(mContext, "12324334", false)
    }
}