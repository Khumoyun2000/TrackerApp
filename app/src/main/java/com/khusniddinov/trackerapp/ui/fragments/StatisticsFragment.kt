package com.khusniddinov.trackerapp.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.khusniddinov.trackerapp.R
import com.khusniddinov.trackerapp.ui.viewModels.StatisticsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StatisticsFragment : Fragment(R.layout.fragment_statistics) {
private val viewModel:StatisticsViewModel by viewModels()

}