package com.himanshoe.dashboard.util

import androidx.navigation.navOptions
import com.himanshoe.core.navigation.NavigateTo
import com.himanshoe.core.navigation.fadeAnimation


private fun navigateToSettings(): NavigateTo.DeepLink {

    return NavigateTo.DeepLink(
        "covid://settings",
        navOptions {
            fadeAnimation()
        }
    )
}

fun deepLinkToSettings() = navigateToSettings()

private fun navigateToSearchByPin(): NavigateTo.DeepLink {

    return NavigateTo.DeepLink(
        "covid://search-by-pin",
        navOptions {
            fadeAnimation()
        }
    )
}

fun deepLinkToSearchByPin() = navigateToSearchByPin()