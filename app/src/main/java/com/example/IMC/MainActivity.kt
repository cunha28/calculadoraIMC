package com.example.IMC

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.ButtonBarLayout
import androidx.core.app.ShareCompat.IntentBuilder
import com.example.meuprimeiroprojeto.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalcular: Button = findViewById(R.id.btnCalcular)
        val edtPeso: EditText = findViewById(R.id.edittxt_peso)
        val edtAltura: EditText = findViewById(R.id.edttxt_altura)


        btnCalcular.setOnClickListener {

            val alturaStr = edtAltura.text.toString()
            val pesoStr = edtPeso.text.toString()

            if (alturaStr.isNotEmpty() && pesoStr.isNotEmpty()) {


                val altura: Float = alturaStr.toFloat()
                val peso: Float = pesoStr.toFloat()


                val alturaFinal: Float = altura * altura
                val result: Float = peso / alturaFinal


                val intent = Intent(this, resultactivity::class.java)

                    .apply {

                        putExtra("EXTRA_RESULT", result)

                    }

                startActivity(intent)
                }else {

                Toast.makeText( this, "Preencher todos os campos", Toast.LENGTH_LONG).show()
                }

            }


        }


    }