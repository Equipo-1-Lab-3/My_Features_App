package com.santiagotorres.myfeaturesapp.ui.perimetroPentagono

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.santiagotorres.myfeaturesapp.databinding.ActivityPerimetroPentagonoBinding

class PerimetroPentagonoActivity : AppCompatActivity() {
    private lateinit var perimetroPentagonoBinding: ActivityPerimetroPentagonoBinding
    private lateinit var perimetroPentagonoViewModel: PerimetroPentagonoViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        perimetroPentagonoBinding=ActivityPerimetroPentagonoBinding.inflate(layoutInflater)
        perimetroPentagonoViewModel=ViewModelProvider(this)[PerimetroPentagonoViewModel::class.java]
        val view =perimetroPentagonoBinding.root
        setContentView(view)

        val perimetroPentagonoObserver = Observer<String>{ perimetroPentagono ->
            perimetroPentagonoBinding.resultadoPPTextView.setText(perimetroPentagono)

        }
        val erroBasioObserver = Observer<String?>{ erroBasio ->
            perimetroPentagonoBinding.LadoInputLayout.error= erroBasio

        }
        perimetroPentagonoViewModel.perimetroPentagono.observe(this, perimetroPentagonoObserver)
        perimetroPentagonoViewModel.errorBasio.observe(this, erroBasioObserver)

        perimetroPentagonoBinding.CalcularPPButton.setOnClickListener {
            val ladoPentagono = perimetroPentagonoBinding.LadoInput.text.toString()
            perimetroPentagonoViewModel.calcularPerimetro(ladoPentagono)
        }

    }
}