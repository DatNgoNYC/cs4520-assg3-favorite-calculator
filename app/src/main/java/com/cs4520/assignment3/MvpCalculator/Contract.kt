package com.cs4520.assignment3.MvpCalculator

interface Contract {
    interface View {
        fun showResult(result: String)
        fun showError(message: String)
        fun clearInputs()
    }

    interface Presenter {
        fun onAddClicked(a: String, b: String)
        fun onSubtractClicked(a: String, b: String)
        fun onMultiplyClicked(a: String, b: String)
        fun onDivideClicked(a: String, b: String)
    }
}