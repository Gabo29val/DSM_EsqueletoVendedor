package com.example.esqueletovendedor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "Ahhhh", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "Otro cambio", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "Tercer cambio", Toast.LENGTH_SHORT).show()

    }
}