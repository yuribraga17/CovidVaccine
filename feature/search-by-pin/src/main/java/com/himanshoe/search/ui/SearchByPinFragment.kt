package com.himanshoe.search.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.fragment.app.viewModels
import com.himanshoe.core.base.BaseFragment
import com.himanshoe.search.component.MainSearchDataScreen
import com.himanshoe.search.component.SearchComponent
import com.himanshoe.search.component.SearchToolbar
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.FlowPreview

@AndroidEntryPoint
class SearchByPinFragment : BaseFragment() {

    private val viewModel by viewModels<SearchByPinViewModel>()

    override fun setupObserver() {

    }

    override fun init() {
        viewModel.navigator.navigateBy(this)
    }

    @FlowPreview
    @ExperimentalComposeUiApi
    @Composable
    override fun SetupView() {
        Scaffold(modifier = Modifier.fillMaxSize(),
            topBar = {
                Column {
                    SearchToolbar {
                        viewModel.goBack()
                    }
                    SearchComponent {
                        viewModel.onSearch(it)
                    }
                }
            }) {
            MainSearchDataScreen(viewModel)
        }
    }
}