package com.example.navigationcompose.ui.view.screen

import android.widget.Button
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.Modifier
import com.example.navigationcompose.model.Mahasiswa

fun DetailMahasiswaView(
    dataMhs: Mahasiswa,
    modifier: Modifier = Modifier,
    onBackButton: () -> Unit
){
