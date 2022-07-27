package com.khusniddinov.trackerapp.ui.viewModels


import androidx.lifecycle.ViewModel
import com.khusniddinov.trackerapp.repositories.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(val repository: MainRepository) : ViewModel() {

}