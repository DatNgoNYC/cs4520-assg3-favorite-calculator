package com.cs4520.assignment3.MvpCalculator

class Model {
    fun add(a: Double, b: Double) = a + b
    fun subtract(a: Double, b: Double) = a - b
    fun multiply(a: Double, b: Double) = a * b
    fun divide(a: Double, b: Double) {
        if (b == 0.0) throw ArithmeticException("Cannot divide by zero")
    }
}