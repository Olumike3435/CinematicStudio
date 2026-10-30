package com.example.cinematicstudio

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.arthenica.ffmpegkit.FFmpegKit
import com.arthenica.ffmpegkit.ReturnCode

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnTrim = findViewById<Button>(R.id.btnTrimVideo)
        btnTrim?.setOnClickListener {
            Toast.makeText(this, "Cinematic Studio Video Engine Initialized", Toast.LENGTH_SHORT).show()
        }
    }
}
