package dev.ogabek.task2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

    }

    private fun initViews() {
        val openBtn = findViewById<Button>(R.id.btn_open)
        openBtn.setOnClickListener {
            openSecondActivity()
        }
    }

    private fun openSecondActivity() {
        startActivity(Intent(this, SecondActivity::class.java))
    }

}