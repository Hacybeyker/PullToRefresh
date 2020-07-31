package com.hacybeyker.pulltorefresh

import androidx.appcompat.widget.AppCompatImageView
import androidx.databinding.BindingAdapter

/**
 * Created by Carlos Osorio Perez on 30/07/2020.
 */

@BindingAdapter("srcUrl")
fun setImage(imageView: AppCompatImageView, url: String) {
    imageView.load(url)
}