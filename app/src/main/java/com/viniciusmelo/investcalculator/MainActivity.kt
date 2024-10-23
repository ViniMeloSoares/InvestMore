package com.viniciusmelo.investcalculator

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText
import java.text.NumberFormat
import java.util.Locale
import kotlin.math.pow

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
    val formatoReal = NumberFormat.getCurrencyInstance(Locale("pt", "BR"))


    btn_calcular.setOnClickListener {

    val ApInicialSpring = edt_AporteInicial.text.toString()
    val ApMesSpring = edt_AporteMes.text.toString()
    val PeriodoSpring = edt_Periodo.text.toString()
    val JurosSpring = edt_Juros.text.toString()

    if (ApInicialSpring == ""|| ApMesSpring == ""|| PeriodoSpring == "" || JurosSpring == "") {
    Snackbar.make(
    edt_AporteInicial,
        "Preecha todos os campos",
        Snackbar.LENGTH_LONG).show()

    } else {
      val aporteInicial: Double = ApInicialSpring.toDouble()
      val aporteMes: Double = ApMesSpring.toDouble()
      val Periodo: Int = PeriodoSpring.toInt()
      val Juros: Float = JurosSpring.toFloat()
      val JurosDecimal = Juros/100

      val resultado = aporteInicial*(1+JurosDecimal).pow(Periodo) + (aporteMes*((1+JurosDecimal).pow(Periodo)-1))/JurosDecimal
      val valorfinal = findViewById<TextView>(R.id.ValorTotal)
      valorfinal.text = formatoReal.format(resultado)

      }
    }
  }
}
