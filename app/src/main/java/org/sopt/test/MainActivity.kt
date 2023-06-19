package org.sopt.test

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "Hello World0", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "Hello World1", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "Hello World2", Toast.LENGTH_LONG).show()
        Toast.makeText(this, "Hello World3", Toast.LENGTH_LONG).show()
    }
}