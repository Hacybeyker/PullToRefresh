package com.hacybeyker.pulltorefresh

import android.widget.ImageView
import coil.ImageLoader
import coil.request.LoadRequest

/**
 * Created by Carlos Osorio Perez on 30/07/2020.
 */

fun ImageView.load(url: String) {
    val imageLoader = ImageLoader.Builder(context)
        .bitmapPoolPercentage(0.5)
        .crossfade(true)
        .placeholder(R.drawable.ic_image_default)
        .error(R.drawable.ic_image_default)
        .build()
    val request = LoadRequest.Builder(context)
        .data(url)
        .placeholder(R.drawable.ic_image_default)
        .error(R.drawable.ic_image_default)
        .target(this)
        .build()
    imageLoader.execute(request)
}