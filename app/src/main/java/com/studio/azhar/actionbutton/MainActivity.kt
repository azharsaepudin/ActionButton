package com.studio.azhar.actionbutton

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_Toast.setOnClickListener {
            Toast.makeText(this, "Ini Toast", Toast.LENGTH_LONG).show()
        }

        btn_Intent.setOnClickListener {
            val intent = Intent(this,LandingActivity::class.java)
            startActivity(intent)
        }

        btn_Extra.setOnClickListener {
            val nama = edt_Nama.text.toString().trim()
            val intent = Intent(this, LandingActivity::class.java).apply {
                putExtra("namaMhs", nama)
            }
            startActivity(intent)

        }
    }
}
