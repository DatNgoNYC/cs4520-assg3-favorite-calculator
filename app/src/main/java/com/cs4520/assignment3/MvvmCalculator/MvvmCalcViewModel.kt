package com.cs4520.assignment3.MvvmCalculator

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.cs4520.assignment3.MvpCalculator.Model

class MvvmCalcViewModel : ViewModel() {
    private var _result = MutableLiveData<Double>()
    val result: LiveData<Double> get() = _result

    // We will use the calculator model from MVP
    private val calculator = Model()

    fun add(a: Double, b: Double) {
        _result.value = calculator.add(a, b);
    }

}