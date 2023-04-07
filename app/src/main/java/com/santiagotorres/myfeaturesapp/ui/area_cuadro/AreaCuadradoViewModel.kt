package com.santiagotorres.myfeaturesapp.ui.area_cuadro

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AreaCuadradoViewModel: ViewModel() {
    val resultado : MutableLiveData<Double> by lazy{
        MutableLiveData<Double>()
    }

    fun calculo(vAlto:Double,vAncho:Double){
        resultado.value=vAlto*vAncho
    }
}