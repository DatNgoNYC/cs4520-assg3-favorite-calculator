package com.cs4520.assignment3.MvvmCalculator

import androidx.lifecycle.MutableLiveData

class MvvmViewModel(private val mvvmModel: MvvmModel, private val repository: Repository ) {
    val input1 = MutableLiveData<String>()
    val input2 = MutableLiveData<String>()
    val result = MutableLiveData<String>()

    fun calculate(operator: String) {
        val a = input1.value?.toDoubleOrNull()
        val b = input2.value?.toDoubleOrNull()

        if (a == null || b == null) {
            result.value = "Invalid Input"
            return
        }

        result.value = when (operator) {
            "add" -> mvvmModel.add(a, b).toString()
            "subtract" -> mvvmModel.subtract(a, b).toString()
            "multiply" -> mvvmModel.multiply(a, b).toString()
            "divide" -> mvvmModel.divide(a, b).toString()

            else -> {"should not happen"}
        }

        clearInput()
    }

    private fun clearInput() {
        input1.value = ""
        input2.value = ""
    }
}