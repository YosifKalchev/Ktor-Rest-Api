package com.ykcoding.myapplication

import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ykcoding.myapplication.data.Computer
import com.ykcoding.myapplication.data.ComputersApi
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
private val api: ComputersApi
): ViewModel() {

    private val _state  = mutableStateOf(ComputerState())
    val state: State<ComputerState> = _state

    init {
        getRandomPc()
    }

    fun getRandomPc() {
        viewModelScope.launch {
            try {
                _state.value = state.value.copy(isLoading = true)
                _state.value = state.value.copy(
                    computer = api.getRandomPc(),
                    isLoading = false
                )
            } catch (e: Exception) {
                Log.e("MainViewModel", "getRandomPc: ", e)
                _state.value = state.value.copy(isLoading = false)
            }
        }
    }

    data class ComputerState(
        val computer: Computer? = null,
        val isLoading: Boolean = false
    )
}