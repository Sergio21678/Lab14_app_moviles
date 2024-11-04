package com.example.labwidgets

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import com.example.labwidgets.ui.theme.LabWidgetsTheme

class CameraActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LabWidgetsTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    Text("Accediendo a la Cámara...")
                }
            }
        }
    }
}
