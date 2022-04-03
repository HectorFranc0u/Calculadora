package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text
import java.math.RoundingMode
import java.text.DecimalFormat

class ASC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_asc)

        var btn = findViewById<Button>(R.id.btncalcularasc)
        var edtxtpeso = findViewById<EditText>(R.id.edtxtpesoasc)
        var edtxtalt = findViewById<EditText>(R.id.edtxtestasc)
        var txt = findViewById<TextView>(R.id.txtresasc)

        btn.setOnClickListener{

            var peso = (edtxtpeso.text.toString()).toDouble()
            var altura = (edtxtalt.text.toString()).toDouble()

            var total = (2.35 * (Math.pow(altura, 0.42246) * (Math.pow(peso, 0.51456)))) / 100.00

            val df = DecimalFormat("#.##")
            df.roundingMode = RoundingMode.DOWN
            val ASCroundoff = (df.format(total)).toString()

            txt.setText(ASCroundoff + " Metros cuadrados")
        }
    }
}