package com.santiagotorres.myfeaturesapp.ui.area_pentagono

import android.widget.LinearLayout
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.android.material.snackbar.Snackbar
class AreaPentagonoViewModel : ViewModel() {
    val Resultado: MutableLiveData<Double> by lazy {
        MutableLiveData<Double>()
    }

    val emptyText: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }

    fun  verificarDatos(baseInput: String, alturaInput : String, layout: LinearLayout) {
        if (baseInput.isEmpty() ||  alturaInput.isEmpty() ){
            emptyText.value = "Tiene algún valor vacío "

            Snackbar.make(layout,
                emptyText.value.toString(),
                Snackbar.LENGTH_INDEFINITE).setAction("Aceptar") {
            }.show()
        }
    }
    fun calcularAreaPentagono(perimetroPentInput: String, apotemaPentInput : String) {
        if (perimetroPentInput.isEmpty() || apotemaPentInput.isEmpty() ){

        }
        else{
            var perimetroP = perimetroPentInput.toDouble()
            var apotemaP = apotemaPentInput.toDouble()
            Resultado.value = ( (perimetroP*apotemaP) / 2)
        }
    }
}
