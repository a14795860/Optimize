package com.umin.optimize.task

import com.facebook.drawee.backends.pipeline.Fresco
import com.umin.start.dispatcher.Task

/**
 * author:     YYM
 * createdTime:2022/4/25 下午 5:29
 * email:      b14795860@163.com
 * description:
 */
class FrescoTask : Task() {

    override fun run() {
        Fresco.initialize(mContext)
    }
}