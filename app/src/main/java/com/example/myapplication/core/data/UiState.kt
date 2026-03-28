package com.example.myapplication.core.data

sealed class UiState <out T>{
    data class Success<T>(val data:T): UiState<T>()
    data class Error<T>(val data:String): UiState<Nothing>()
    data object Loading: UiState<Nothing>()
    data object Empty: UiState<Nothing>()
}