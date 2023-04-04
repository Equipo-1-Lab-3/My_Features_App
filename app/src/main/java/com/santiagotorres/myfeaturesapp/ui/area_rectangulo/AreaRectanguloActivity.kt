package com.santiagotorres.myfeaturesapp.ui.area_rectangulo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.santiagotorres.myfeaturesapp.databinding.ActivityAreaRectanguloBinding
import com.santiagotorres.myfeaturesapp.ui.area_pentagono.AreaPentagonoViewModel
import java.text.DecimalFormat

class AreaRectanguloActivity : AppCompatActivity(){

    private lateinit var areaRectanguloBinding: ActivityAreaRectanguloBinding
    private lateinit var areaRectanguloViewModel: AreaRectanguloViewModel
    private val df = DecimalFormat("###,###,###.##")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        areaRectanguloBinding = ActivityAreaRectanguloBinding.inflate(layoutInflater)
        areaRectanguloViewModel = ViewModelProvider(this)[AreaRectanguloViewModel::class.java]
        val view = areaRectanguloBinding.root
        setContentView(view)

        areaRectanguloBinding.calculateAreaButton.setOnClickListener {

            val verificar = Observer<String> {
                areaRectanguloBinding.resultText.text = ""
            }
            areaRectanguloViewModel.emptyText.observe(this, verificar)


            val calcular = Observer<Double> {result->
                areaRectanguloBinding.resultText.text = "El área es ${df.format(result)} cm"
            }
            areaRectanguloViewModel.Resultado.observe(this, calcular)


            areaRectanguloViewModel.verificarDatos (areaRectanguloBinding.BaseInput.text.toString(),
                areaRectanguloBinding.AlturaInput.text.toString(), areaRectanguloBinding.uniqueLayout)

            areaRectanguloViewModel.calcularArea (areaRectanguloBinding.BaseInput.text.toString(),
                areaRectanguloBinding.AlturaInput.text.toString())

        }
    }




}