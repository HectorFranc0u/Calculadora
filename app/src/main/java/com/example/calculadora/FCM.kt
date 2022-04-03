package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class FCM : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fcm)

        var btn = findViewById<Button>(R.id.btnresfcm)
        var txt = findViewById<TextView>(R.id.txtresfcm)
        var edtxt = findViewById<EditText>(R.id.edtxtedadfcm)

        btn.setOnClickListener{

            var edad = (edtxt.text.toString()).toInt()
            var total = 220 - edad
            
            txt.setText(total.toString())
        }
    }
}