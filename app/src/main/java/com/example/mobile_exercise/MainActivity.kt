package com.example.mobile_exercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun calcularResultado(view: View) {
        val alcool = findViewById<EditText>(R.id.alcool).text.toString().toInt()
        val gasolina = findViewById<EditText>(R.id.gasolina).text.toString().toInt()
        val resultado = findViewById<TextView>(R.id.resultado)

        if(alcool > gasolina){
            resultado.setText("Álcool esmurrou a gasolina, amado!")
        } else if(alcool == gasolina) {
            resultado.setText("Empate xuxu!")
        } else {
            resultado.setText("Gasolinha esmurrou o álcool, coração")
        }

    }


}






