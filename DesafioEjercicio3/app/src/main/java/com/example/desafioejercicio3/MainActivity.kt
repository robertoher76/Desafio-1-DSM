package com.example.desafioejercicio3

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

lateinit var valor1 : EditText
lateinit var valor2 : EditText
lateinit var enviar : Button
lateinit var resultado : TextView
lateinit var spinner01 : Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        valor1 = findViewById(R.id.TxtValor1)
        valor2 = findViewById(R.id.TxtValor2)
        enviar = findViewById(R.id.BtnEnviar)
        resultado = findViewById(R.id.LblResultado)
        spinner01 = findViewById(R.id.Spinner01)

        enviar.setOnClickListener {
            val Operador : String = spinner01.getSelectedItem().toString()

            var valor01: Double = valor1.text.toString().toDouble()
            var valor02: Double = valor2.text.toString().toDouble()

            var total: Double = 0.0

            when (Operador) {
                "Sumar" -> {
                    total = valor01 + valor02
                    resultado.setText("Resultado: $total")
                }
                "Restar" -> {
                    total = valor01 - valor02
                    resultado.setText("Resultado: $total")
                }
                "Multiplicar" -> {
                    total = valor01 * valor02
                    resultado.setText("Resultado: $total")
                }
                "Dividir" -> {
                    total = valor01 / valor02
                    resultado.setText("Resultado: $total")
                }
                else -> {
                    resultado.setText("Operador no valido")
                }
            }
        }
    }
}