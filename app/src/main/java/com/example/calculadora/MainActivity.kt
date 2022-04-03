package com.example.calculadora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnIMC = findViewById<Button>(R.id.btnIMC);
        var btnPAN = findViewById<Button>(R.id.btnPAN);
        var btnASC = findViewById<Button>(R.id.btnASC);
        var btnFCM = findViewById<Button>(R.id.btnFCM);

        btnIMC.setOnClickListener{
            val imc: Intent = Intent(this, IMC::class.java)
            startActivity(imc)
        }

        btnPAN.setOnClickListener{
            val pan: Intent = Intent(this, PAN::class.java);
            startActivity(pan)
        }

        btnASC.setOnClickListener{
            val asc: Intent = Intent(this, ASC::class.java);
            startActivity(asc)
        }

        btnFCM.setOnClickListener{
            val fcm: Intent = Intent(this, FCM::class.java)
            startActivity(fcm)
        }
    }
}