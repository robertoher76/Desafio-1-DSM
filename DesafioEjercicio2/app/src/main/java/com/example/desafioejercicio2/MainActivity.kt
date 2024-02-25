package com.example.desafioejercicio2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

lateinit var nombre : EditText
lateinit var nota1 : EditText
lateinit var nota2 : EditText
lateinit var nota3 : EditText
lateinit var nota4 : EditText
lateinit var nota5 : EditText
lateinit var enviar : Button
lateinit var resultado : TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nombre = findViewById(R.id.TxtNombre)
        nota1 = findViewById(R.id.TxtNota1)
        nota2 = findViewById(R.id.TxtNota2)
        nota3 = findViewById(R.id.TxtNota3)
        nota4 = findViewById(R.id.TxtNota4)
        nota5 = findViewById(R.id.TxtNota5)
        enviar = findViewById(R.id.BtnEnviar)
        resultado = findViewById(R.id.LblResultado)

        enviar.setOnClickListener{

            if (nombre.text.toString().trim().isNotEmpty() &&
                nota1.text.toString().trim().isNotEmpty() &&
                nota2.text.toString().trim().isNotEmpty() &&
                nota3.text.toString().trim().isNotEmpty() &&
                nota4.text.toString().trim().isNotEmpty() &&
                nota5.text.toString().trim().isNotEmpty()
            ) {

                val nombreMateria: String = nombre.text.toString()
                val nota1Value: Double = nota1.text.toString().toDouble()
                val nota2Value: Double = nota2.text.toString().toDouble()
                val nota3Value: Double = nota3.text.toString().toDouble()
                val nota4Value: Double = nota4.text.toString().toDouble()
                val nota5Value: Double = nota5.text.toString().toDouble()
                val notaPromedio: Double = (nota1Value + nota2Value + nota3Value + nota4Value + nota5Value) / 5;

                var resultadoTxt: String = "Resultado:"

                if (notaPromedio >= 6) {
                    resultadoTxt = "Haz aprobado $nombreMateria, tu nota promedio es: $notaPromedio"
                } else {
                    resultadoTxt = "Haz reprobado $nombreMateria, tu nota promedio es: $notaPromedio"
                }
                resultado.setText(resultadoTxt)
            } else {
                resultado.setText("Por Favor, ingrese todos los campos para procesar la nota promedio.")
            }

        }
    }
}