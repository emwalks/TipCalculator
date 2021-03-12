package com.example.tipcalculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tipcalculator.databinding.ActivityMainBinding
import java.text.NumberFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.calculateButton.setOnClickListener { calculateTip() }
    }

    private fun calculateTip() {

        val stringInTextField = binding.costOfService.text.toString()
        val costOfService = stringInTextField.toDoubleOrNull()

        if (costOfService == null) {
            displayTip(0.0)
            return
        }

        val tipPercentage = when (binding.tipOptions.checkedRadioButtonId) {
            R.id.option_twenty_percent -> 0.20
            R.id.option_eighteen_percent -> 0.18
            R.id.option_fifteen_percent -> 0.15
            else -> 0.0
        }

        var calculatedTip = tipPercentage * costOfService

        if (binding.roundUpSwitch.isChecked) {
            calculatedTip = kotlin.math.ceil(calculatedTip)
        }

        displayTip(calculatedTip)


    }

    private fun displayTip(tip: Double) {
        val formattedTip = NumberFormat.getCurrencyInstance(Locale.getDefault()).format(tip)
        binding.tipResult.text = getString(R.string.tip_amount,  formattedTip)

    }
}