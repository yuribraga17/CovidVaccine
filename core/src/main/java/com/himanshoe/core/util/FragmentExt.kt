package com.himanshoe.core.util

import android.view.View
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import com.himanshoe.core.design.AppTheme

fun Fragment.setupView(initUi: @Composable () -> Unit): View {
    return ComposeView(requireContext()).apply {
        setContent {
            AppTheme {
                initUi()
            }
        }
    }
}