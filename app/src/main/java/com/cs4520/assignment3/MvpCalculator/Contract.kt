package com.cs4520.assignment3.MvpCalculator

interface Contract {
    interface View {
        fun showResult(result: String)
        fun showError(message: String)
        fun clearInputs()
    }

    interface Presenter {
        fun onAddClicked(a: Double, b: Double)
        fun onSubtractClicked(a: Double, b: Double)
        fun onMultiplyClicked(a: Double, b: Double)
        fun onDivideClicked(a: Double, b: Double)
    }
}