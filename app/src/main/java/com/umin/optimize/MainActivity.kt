package com.umin.optimize

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.facebook.drawee.backends.pipeline.Fresco
import com.facebook.drawee.view.SimpleDraweeView
import com.umin.optimize.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<SimpleDraweeView>(R.id.draweeView).load("asset:///playing.webp")
    }
}

fun SimpleDraweeView?.load(url: String) {
    if (this != null) {
        controller = Fresco.newDraweeControllerBuilder().setUri(Uri.parse(url)).setAutoPlayAnimations(true).build()
    }
}