package com.cs4520.assignment3.MvpCalculator

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.cs4520.assignment3.R

class View : Fragment(), Contract.View {

    private lateinit var input1: EditText
    private lateinit var input2: EditText
    private lateinit var resultField: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstaceState: Bundle?
    ): View? {
        // We're inflating the layout (xml file) for this fragment into a "View" object.
        val view = inflater.inflate(R.layout.mvp_calculator_fragment, container, false);

        // Initialize the presenter that we'll use later when creating eventListeners
        val model = Model()
        val presenter = Presenter(this, model)

        // Find the EditTexts and TextView to use as "View" objects later when we need to change UI
        input1 = view.findViewById(R.id.input_1)
        input2 = view.findViewById(R.id.input_2)
        resultField = view.findViewById(R.id.resultField)

        // Setting up the buttons' click listeners
        view.findViewById<Button>(R.id.buttonAdd).setOnClickListener {
            presenter.onAddClicked(
                input1.text.toString(),
                input2.text.toString()
            )
        }

        view.findViewById<Button>(R.id.buttonSubtract).setOnClickListener {
            presenter.onSubtractClicked(
                input1.text.toString(),
                input2.text.toString()
            )
        }

        view.findViewById<Button>(R.id.buttonMultiply).setOnClickListener {
            presenter.onMultiplyClicked(
                input1.text.toString(),
                input2.text.toString()
            )
        }

        view.findViewById<Button>(R.id.buttonDivide).setOnClickListener {
            presenter.onDivideClicked(
                input1.text.toString(),
                input2.text.toString()
            )
        }

        return view
    }

    override fun showResult(result: String) {
        resultField.visibility = View.VISIBLE
        resultField.text = result
    }

    override fun showError(message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

    override fun clearInputs() {
        input1.text.clear()
        input2.text.clear()
    }

}