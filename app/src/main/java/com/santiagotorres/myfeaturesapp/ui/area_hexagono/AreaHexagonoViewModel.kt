package com.santiagotorres.myfeaturesapp.ui.area_hexagono

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.math.sqrt

class AreaHexagonoViewModel : ViewModel() {
    val area: MutableLiveData<Double> by lazy {
        MutableLiveData<Double>()
    }
    fun validateNull(sideLength: String) : Boolean{
        return !(sideLength.isEmpty())
    }
    fun calculateAreaHexagono(sideLength: Double) {
        val areaHexagono = (3 * sqrt(3.0) / 2) * sideLength * sideLength
        area.value = areaHexagono
    }
}
