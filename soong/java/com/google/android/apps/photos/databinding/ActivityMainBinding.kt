/*
 * SPDX-FileCopyrightText: 2026 The LineageOS Project
 * SPDX-License-Identifier: Apache-2.0
 */

package com.google.android.apps.photos.databinding

import android.view.LayoutInflater
import android.widget.FrameLayout
import android.widget.ProgressBar
import android.widget.TextView
import com.google.android.apps.photos.R

// Soong replacement for the Gradle generated view binding of activity_main.xml
class ActivityMainBinding private constructor(
    val root: FrameLayout,
    val progressBar: ProgressBar,
    val textView: TextView,
) {
    companion object {
        fun inflate(inflater: LayoutInflater): ActivityMainBinding {
            val root = inflater.inflate(R.layout.activity_main, null, false) as FrameLayout
            return ActivityMainBinding(
                root,
                root.requireViewById(R.id.progressBar),
                root.requireViewById(R.id.textView),
            )
        }
    }
}
