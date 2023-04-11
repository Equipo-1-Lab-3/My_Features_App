package com.santiagotorres.myfeaturesapp.ui.area_hexagono

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.santiagotorres.myfeaturesapp.R
import com.santiagotorres.myfeaturesapp.databinding.ActivityAreaHexagonoBinding

class AreaHexagonoActivity : AppCompatActivity() {
    private lateinit var areaHexagonoBinding: ActivityAreaHexagonoBinding
    private lateinit var areaHexagonoViewModel: AreaHexagonoViewModel//@SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        areaHexagonoBinding = ActivityAreaHexagonoBinding.inflate(layoutInflater)
        val view = areaHexagonoBinding.root
        setContentView(view)
        areaHexagonoViewModel = ViewModelProvider(this)[AreaHexagonoViewModel::class.java]

        val areaObserver = Observer<Double> { area ->
            areaHexagonoBinding.areaHexagonoResultText.text = "${getString(R.string.area_hexagono_result)} ${String.format("%.2f", area)}"
        }
        areaHexagonoViewModel.area.observe(this, areaObserver)

        areaHexagonoBinding.areaHexagonoCalculateButton.setOnClickListener {
            if (areaHexagonoViewModel.validateNull(areaHexagonoBinding.ladoAreaHexagonoTextInputEditText.text.toString())) {
                areaHexagonoViewModel.calculateAreaHexagono(
                    areaHexagonoBinding.ladoAreaHexagonoTextInputEditText.text.toString().toDouble()
                )
            } else {
                Toast.makeText(this, getString(R.string.invalid_input_hexagono), Toast.LENGTH_SHORT)
                    .show()
                areaHexagonoBinding.areaHexagonoResultText.text=""
            }
        }
    }
}