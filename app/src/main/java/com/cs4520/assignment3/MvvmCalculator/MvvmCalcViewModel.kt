package com.cs4520.assignment3.MvvmCalculator

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.cs4520.assignment3.MvpCalculator.Model

class MvvmCalcViewModel : ViewModel() {
    private var _result = MutableLiveData<Double>()
    val result: LiveData<Double> get() = _result
    private var _errorMessage = MutableLiveData<String>()
    val errorMessage: LiveData<String> get() = _errorMessage

    // We will use the calculator model from MVP
    private val calculator = Model()

    fun add(a: Double, b: Double) {
        try {
            _result.value = calculator.add(a, b);
        } catch (exception: Exception) {
            _errorMessage.value = exception.toString()
        }
    }

    fun subtract(a: Double, b: Double) {
        try {
            _result.value = calculator.subtract(a, b);
        } catch (exception: Exception) {
            _errorMessage.value = exception.toString()
        }
    }

    fun multiply(a: Double, b: Double) {
        try {
            _result.value = calculator.multiply(a, b);
        } catch (exception: Exception) {
            _errorMessage.value = exception.toString()
        }
    }

    fun divide(a: Double, b: Double) {
        try {
            _result.value = calculator.divide(a, b);
        } catch (exception: Exception) {
            _errorMessage.value = exception.toString()
        }
    }
}