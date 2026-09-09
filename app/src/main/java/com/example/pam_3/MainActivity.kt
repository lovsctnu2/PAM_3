package com.example.pam_3

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.pam_3.ui.theme.HalamanUtama

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("LIFECYCLE_TEST", "onCreate dipanggil")

        setContent {
            HalamanProfil()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("LIFECYCLE_TEST", "onStart dipanggil")
    }

    override fun onResume() {
        super.onResume()
        Log.d("LIFECYCLE_TEST", "onResume dipanggil")
    }

    override fun onPause() {
        super.onPause()
        Log.d("LIFECYCLE_TEST", "onPause dipanggil")
    }

    override fun onStop() {
        super.onStop()
        Log.d("LIFECYCLE_TEST", "onStop dipanggil")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LIFECYCLE_TEST", "onDestroy dipanggil")
    }
}