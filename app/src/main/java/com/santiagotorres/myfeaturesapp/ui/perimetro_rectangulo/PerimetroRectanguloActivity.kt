package com.santiagotorres.myfeaturesapp.ui.perimetro_rectangulo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.santiagotorres.myfeaturesapp.R
import com.santiagotorres.myfeaturesapp.databinding.ActivityPerimetroRectanguloBinding
import java.text.DecimalFormat

class PerimetroRectanguloActivity : AppCompatActivity() {

    private lateinit var converterBinding: ActivityPerimetroRectanguloBinding
    private var valor_base : Double = 0.0
    private var valor_altura : Double = 0.0
    private var valor_perimetro : Double = 0.0
    val df = DecimalFormat("###,###,###.##")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        converterBinding = ActivityPerimetroRectanguloBinding.inflate(layoutInflater)

        val view = converterBinding.root
        setContentView(view)


        converterBinding.calculateButton.setOnClickListener{
            valor_base = converterBinding.BaseInput.text.toString().toDouble()
            valor_altura = converterBinding.AlturaInput.text.toString().toDouble()

            valor_perimetro = (2 * valor_base) + (2 * valor_altura)

            converterBinding.resultText.text = "El perimetro es ${df.format(valor_perimetro)} cm"


        }

    }
}