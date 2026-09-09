package com.example.pam_3.ui.theme

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pam_3.ProfilMahasiswa

@Composable
fun HalamanUtama() {
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // 1. Memanggil komponen ProfilMahasiswa
        ProfilMahasiswa()

        // 2. Memberikan jarak vertikal antar komponen
        Spacer(modifier = Modifier.height(24.dp))

        // 3. Tombol untuk membuka WhatsApp
        Button(onClick = {
            val url = "https://wa.me/6281234567890" // Boleh diganti dengan nomor bebas
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            context.startActivity(intent)
        }) {
            Text("Hubungi via WhatsApp")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewHalamanUtama() {
    HalamanUtama()
}