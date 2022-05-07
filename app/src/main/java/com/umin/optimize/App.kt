package com.umin.optimize

import android.app.Application
import com.umin.optimize.task.*
import com.umin.start.TimeMonitorManager
import com.umin.start.dispatcher.TaskDispatcher

class App : Application() {

    companion object {
        private const val TAG = "App"
        private val CPU_COUNT = Runtime.getRuntime().availableProcessors()
        private val CORE_POOL_SIZE = 2.coerceAtLeast((CPU_COUNT - 1).coerceAtMost(4))
    }

    override fun onCreate() {
        super.onCreate()

        TimeMonitorManager.instance?.startMonitor()

        //方式二、启动器
        TaskDispatcher.init(this)
        TaskDispatcher.newInstance()
            .addTask(FrescoTask())
            .addTask(RouterTask())
            .addTask(LoadSirTask())
            .addTask(BuglyTask())
            .addTask(LoadAppIdTask())
            .addTask(WeChatPayTask())
            .start()

        TimeMonitorManager.instance?.endMonitor("APP onCreate")

//        initBitmapHook()
    }

}