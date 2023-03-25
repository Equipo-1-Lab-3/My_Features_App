package com.santiagotorres.myfeaturesapp.ui.perimetro_rectangulo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.santiagotorres.myfeaturesapp.databinding.ActivityPerimetroRectanguloBinding
import java.text.DecimalFormat

class PerimetroRectanguloActivity : AppCompatActivity() {

    private lateinit var converterBinding: ActivityPerimetroRectanguloBinding
    private lateinit var perimetroRectanguloViewModel: PerimetroRectanguloViewModel

    private var valorbase : Double = 0.0
    private var valoraltura : Double = 0.0
    val df = DecimalFormat("###,###,###.##")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        converterBinding = ActivityPerimetroRectanguloBinding.inflate(layoutInflater)


        perimetroRectanguloViewModel = ViewModelProvider(this)[PerimetroRectanguloViewModel::class.java]


        val view = converterBinding.root
        setContentView(view)


        converterBinding.calculateButton.setOnClickListener{


            val calcularVerificar = Observer<Double> {result->
                converterBinding.resultText.text = "El perimetro es ${df.format(result)} cm"

            }
            perimetroRectanguloViewModel.Resultado.observe(this, calcularVerificar)

            perimetroRectanguloViewModel.calcularPerimetro (converterBinding.BaseInput.text.toString(),
                converterBinding.AlturaInput.text.toString(), converterBinding.uniqueLayout)
        }

    }
}