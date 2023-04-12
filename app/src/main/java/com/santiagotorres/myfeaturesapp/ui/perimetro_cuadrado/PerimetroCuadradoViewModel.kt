package com.santiagotorres.myfeaturesapp.ui.perimetro_cuadrado

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PerimetroCuadradoViewModel: ViewModel() {
    val result : MutableLiveData<Double> by lazy{
        MutableLiveData<Double>()
    }
    fun multi(vlado:Double){
        result.value = vlado*4
    }
}