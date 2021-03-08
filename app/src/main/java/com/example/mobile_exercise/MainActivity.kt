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
        val alcool = findViewById<EditText>(R.id.alcool).text.toString().toDouble()
        val gasolina = findViewById<EditText>(R.id.gasolina).text.toString().toDouble()
        val resultado = findViewById<TextView>(R.id.resultado)
        var result = alcool / gasolina

        if(result >= 0.7){
            resultado.setText("Álcool esmurrou a gasolina, amado!")
        } else if(result.equals(0)) {
            resultado.setText("Empate xuxu!")
        } else {
            resultado.setText("Gasolinha esmurrou o álcool, coração")
        }

    }


}






