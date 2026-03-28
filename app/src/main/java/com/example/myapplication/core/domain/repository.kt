package com.example.myapplication.core.domain

import com.example.myapplication.core.data.Contect
import com.example.myapplication.core.data.UiState
import kotlinx.coroutines.flow.Flow


interface repository {

    suspend fun getAllData():UiState<Contect>
    suspend fun addData(name )
    suspend fun updateData()
    suspend fun delete()
}