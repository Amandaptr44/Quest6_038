package com.example.navigationcompose.ui.view.screen

import android.widget.Button
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.navigationcompose.model.Mahasiswa
import com.example.navigationcompose.model.RencanaStudi

@Composable
fun DetailMahasiswaViewModel(
    mahasiswa: Mahasiswa,
    rencanaStudi: RencanaStudi,
    modifier: Modifier = Modifier,
    onBackButtonClicked: () -> Unit
){
    val listDataMhs = listOf(
        Pair("Nama", mahasiswa.nama),
        Pair("nim", mahasiswa.nim),
        Pair("email", mahasiswa.nama),
        Pair("MataKuliah", rencanaStudi.mataKuliah),
        Pair("Kelas", rencanaStudi.kelas),
    )

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ){
        listDataMhs.forEach{data ->
            DetailMhs(judul = data.first,
                isinya = data.second)
        }

        Spacer(modifier = Modifier.padding(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Button(
                onClick =  { onBackButtonClicked()}
                ){
                Text("Kembali ke Halaman Utama")
            }
        }
    }
}

@Composable
fun DetailMhs(
    judul: String, isinya: String
){
    Row(
        modifier = Modifier.fillMaxWidth() .padding(top = 10.dp)
    ){
        Text(
            text = judul,
            modifier = Modifier.weight(0.8f)
        )
        Text(
            text = ":",
            modifier = Modifier.weight(0.2f)
        )
        Text(
            text = isinya,
            modifier = Modifier.weight(2f)
        )
    }
}