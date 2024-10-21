package com.viniciusmelo.investcalculator

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

    val edt_AporteInicial = findViewById<TextInputEditText>(R.id.edt_APInicial)
    val edt_AporteMes = findViewById<TextInputEditText>(R.id.edt_MensalAporte)
    val edt_Periodo = findViewById<TextInputEditText>(R.id.edt_Meses)
    val edt_Juros = findViewById<TextInputEditText>(R.id.edt_juros)
    val btn_calcular = findViewById<Button>(R.id.btn_Calcular)
    val btn_limpar = findViewById<Button>(R.id.btn_Limpar)



    }
}