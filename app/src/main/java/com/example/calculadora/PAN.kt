package com.example.calculadora

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class PAN : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pan)

        val btn = findViewById<Button>(R.id.btnpan)
        val edtxtedad = findViewById<EditText>(R.id.edtxtEdad)
        val txt = findViewById<TextView>(R.id.txtRes)

        btn.setOnClickListener{

            var edad = (edtxtedad.text.toString()).toInt()

            if (edad < 14) {
                var texto = "No tenemos datos para esta edad. Lo sentimos :("
                txt.setText(texto)
            } else if (edad in 14..18) {
                var texto = "Su rango de presion arterial superior es: 90 - 120 \n" +
                        "Y su rango de presion arterial mas bajo es de: 50 - 80"
                txt.setText(texto)
            } else if (edad in 19..40) {
                var texto = "Su rango de presion arterial superior es: 95 - 135 \n" +
                            "Y su rango de presion arterial mas bajo es de: 60 - 80"
                txt.setText(texto)
            } else if (edad in 41..60) {
                var texto = "Su rango de presion arterial superior es: 110 - 145 \n" +
                        "Y su rango de presion arterial mas bajo es de: 70 - 90"
                txt.setText(texto)
            } else if (edad in 61..122) {
                var texto = "Su rango de presion arterial superior es: 95 - 145 \n" +
                        "Y su rango de presion arterial mas bajo es de: 70 - 90"
                txt.setText(texto)
            } else {
                var texto = "No creemos que estes diciendo la verdad con respecto a tu edad..."
                txt.setText(texto)
            }

        }
    }
}