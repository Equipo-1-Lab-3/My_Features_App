package com.santiagotorres.myfeaturesapp.ui.area_pentagono

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.santiagotorres.myfeaturesapp.databinding.ActivityAreaPentagonoBinding
import java.text.DecimalFormat
class AreaPentagonoActivity : AppCompatActivity() {
    private lateinit var areaPentagonoBinding: ActivityAreaPentagonoBinding
    private lateinit var areaPentagonoViewModel: AreaPentagonoViewModel
    private val df = DecimalFormat("###,###,###.##")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        areaPentagonoBinding = ActivityAreaPentagonoBinding.inflate(layoutInflater)
        areaPentagonoViewModel = ViewModelProvider(this)[AreaPentagonoViewModel::class.java]

        val view = areaPentagonoBinding.root
        setContentView(view)

        areaPentagonoBinding.calculateButton.setOnClickListener{

            val verificar = Observer<String> {
                areaPentagonoBinding.resultText.text = ""
            }
            areaPentagonoViewModel.emptyText.observe(this, verificar)


            val calcular = Observer<Double> {result->
                areaPentagonoBinding.resultText.text = "El área es ${df.format(result)} cm"
            }
            areaPentagonoViewModel.Resultado.observe(this, calcular)

            areaPentagonoViewModel.verificarDatos (areaPentagonoBinding.PerimetroInput.text.toString(),
                areaPentagonoBinding.ApotemaInput.text.toString(), areaPentagonoBinding.uniqueLayout)

            areaPentagonoViewModel.calcularAreaPentagono (areaPentagonoBinding.PerimetroInput.text.toString(),
                areaPentagonoBinding.ApotemaInput.text.toString())
        }
    }

}

