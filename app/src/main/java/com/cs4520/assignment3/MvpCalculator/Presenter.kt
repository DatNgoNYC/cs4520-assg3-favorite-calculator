package com.cs4520.assignment3.MvpCalculator

class Presenter(private val view: Contract.View, private val model: Model) : Contract.Presenter {
    override fun onAddClicked(a: String, b: String) {
        try {
            val sum = model.add(a.toDouble(), b.toDouble())
            view.showResult(sum.toString())
            view.clearInputs()
        } catch (exception: Exception) {
            view.showError(exception.toString())
        }
    }

    override fun onSubtractClicked(a: String, b: String) {
        try {
            val difference = model.subtract(a.toDouble(), b.toDouble())
            view.showResult(difference.toString())
            view.clearInputs()
        } catch (exception: Exception) {
            view.showError(exception.toString())
        }
    }

    override fun onMultiplyClicked(a: String, b: String) {
        try {
            val product = model.multiply(a.toDouble(), b.toDouble())
            view.showResult(product.toString())
            view.clearInputs()
        } catch (exception: Exception) {
            view.showError(exception.toString())
        }    }

    override fun onDivideClicked(a: String, b: String) {
        try {
            val quotient = model.divide(a.toDouble(), b.toDouble())
            view.showResult(quotient.toString())
            view.clearInputs()
        } catch (exception: Exception) {
            view.showError(exception.toString())
        }    }
}