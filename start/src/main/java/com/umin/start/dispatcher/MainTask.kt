package com.umin.start.dispatcher

abstract class MainTask : Task() {
    override fun runOnMainThread(): Boolean {
        return true
    }
}