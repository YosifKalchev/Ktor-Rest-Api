package com.ykalchev.computersapp

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.ykalchev.computersapp.data.Computer
import com.ykalchev.computersapp.data.ComputersApi
import javax.inject.Inject
import androidx.compose.runtime.State
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch

@HiltViewModel
class MainViewModel @Inject constructor(
    private val api: ComputersApi
): ViewModel() {

    private val _state = mutableStateOf(ComputerState())
    val state: State<ComputerState> = _state

    init {
        getRandomComputer()
    }

    fun getRandomComputer() {
        viewModelScope.launch {
            try {
                _state.value = state.value.copy(isLoading = true)
                _state.value = state.value.copy(
                    computer = api.getRandomComputer(),
                    isLoading = false
                )
            } catch (e: Exception) {
                Log.e("MainViewModel", "getRandomComputer: ", e)
                _state.value = state.value.copy(isLoading = false)
            }
        }
    }

    data class ComputerState(
        val computer: Computer? = null,
        val isLoading: Boolean = false
    )
}