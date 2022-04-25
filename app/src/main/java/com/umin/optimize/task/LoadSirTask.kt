package com.umin.optimize.task

import com.umin.start.dispatcher.Task
import com.kingja.loadsir.core.LoadSir

/**
 * @date：2021/8/11
 * @author fushiyao
 * @instruction：
 */
class LoadSirTask : Task() {

    override fun needWait(): Boolean {
        return true
    }

    override fun run() {
        LoadSir.beginBuilder()
            .commit()
    }
}