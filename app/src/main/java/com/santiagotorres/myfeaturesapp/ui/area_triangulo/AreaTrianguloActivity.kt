package com.santiagotorres.myfeaturesapp.ui.area_triangulo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.santiagotorres.myfeaturesapp.databinding.ActivityAreaTrianguloBinding

class AreaTrianguloActivity : AppCompatActivity() {

    private lateinit var areaTrianguloBinding: ActivityAreaTrianguloBinding
    private lateinit var areaTrianguloViewModel: AreaTrianguloViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       areaTrianguloBinding=ActivityAreaTrianguloBinding.inflate(layoutInflater)
        areaTrianguloViewModel= ViewModelProvider(this)[AreaTrianguloViewModel::class.java]

        val mensajeObserver = Observer<String>{mensaje ->
            areaTrianguloBinding.totalTextView.text=mensaje
        }
        areaTrianguloViewModel.mensaje.observe(this, mensajeObserver)

        areaTrianguloBinding.calcularAreaButton.setOnClickListener {
            areaTrianguloViewModel.Calculo_area_triangulo(
                areaTrianguloBinding.BaseInput.text.toString(),
                areaTrianguloBinding.AlturaInput.text.toString())
        }



        val view= areaTrianguloBinding.root
        setContentView(view)

    }
}