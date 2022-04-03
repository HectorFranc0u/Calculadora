package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.math.BigDecimal
import java.math.RoundingMode
import java.text.DecimalFormat

class IMC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc)

        var btn = findViewById<Button>(R.id.btnCalcular)
        var edtxtpeso = findViewById<EditText>(R.id.edtxtpeso)
        var edtxtaltura = findViewById<EditText>(R.id.edtxtaltura)
        var txtres = findViewById<TextView>(R.id.txtResultado)

        btn.setOnClickListener{

            var peso = (edtxtpeso.text.toString()).toDouble()
            var altura = (edtxtaltura.text.toString()).toDouble()
            var IMCres = peso / (Math.pow(altura, 2.00))

            val df = DecimalFormat("#.##")
            df.roundingMode = RoundingMode.DOWN
            val IMCroundoff = (df.format(IMCres)).toString()

            txtres.setText(IMCroundoff)
        }

    }
}