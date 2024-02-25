package com.example.desafioejercicio1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

lateinit var nombre : EditText
lateinit var salarioBase : EditText
lateinit var enviar : Button
lateinit var resultado : TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nombre = findViewById(R.id.TxtNombre)
        salarioBase = findViewById(R.id.TxtSalarioBase)
        enviar = findViewById(R.id.BtnEnviar)
        resultado = findViewById(R.id.LblResultado)

        enviar.setOnClickListener{
            if (nombre.text.toString().trim().length > 0 && salarioBase.text.toString().trim().length > 0) {
                var nombreUsuario: String = nombre.text.toString()
                var salarioBaseValue: Double = salarioBase.text.toString().toDouble()
                var salarioBaseUsuario: Double =
                    salarioBaseValue - ((salarioBaseValue * 0.03) + (salarioBaseValue * 0.04) + (salarioBaseValue * 0.04))
                var resultadoTxt: String =
                    "Hola $nombreUsuario, tu salario neto es de $$salarioBaseUsuario"

                resultado.setText(resultadoTxt)
            } else {
                resultado.setText("Por Favor, ingrese el nombre y saldo base para calcular su salario neto.")
            }
        }
    }
}