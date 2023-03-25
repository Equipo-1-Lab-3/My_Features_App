package com.santiagotorres.myfeaturesapp.ui.perimetro_rectangulo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.santiagotorres.myfeaturesapp.databinding.ActivityPerimetroRectanguloBinding
import java.text.DecimalFormat

class PerimetroRectanguloActivity : AppCompatActivity() {

    private lateinit var perimetrorectanguloBinding: ActivityPerimetroRectanguloBinding
    private lateinit var perimetroRectanguloViewModel: PerimetroRectanguloViewModel

    private var valorbase : Double = 0.0
    private var valoraltura : Double = 0.0
    val df = DecimalFormat("###,###,###.##")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        perimetrorectanguloBinding = ActivityPerimetroRectanguloBinding.inflate(layoutInflater)


        perimetroRectanguloViewModel = ViewModelProvider(this)[PerimetroRectanguloViewModel::class.java]


        val view = perimetrorectanguloBinding.root
        setContentView(view)


        perimetrorectanguloBinding.calculateButton.setOnClickListener{

            val verificar = Observer<String> {result->
                perimetrorectanguloBinding.resultText.text = ""
            }
            perimetroRectanguloViewModel.emptyText.observe(this, verificar)


            val calcular = Observer<Double> {result->
                perimetrorectanguloBinding.resultText.text = "El perimetro es ${df.format(result)} cm"
            }
            perimetroRectanguloViewModel.Resultado.observe(this, calcular)


            perimetroRectanguloViewModel.verificarDatos (perimetrorectanguloBinding.BaseInput.text.toString(),
                perimetrorectanguloBinding.AlturaInput.text.toString(), perimetrorectanguloBinding.uniqueLayout)

            perimetroRectanguloViewModel.calcularPerimetro (perimetrorectanguloBinding.BaseInput.text.toString(),
                perimetrorectanguloBinding.AlturaInput.text.toString())
        }
    }
}