package com.cs4520.assignment3.MvpCalculator

import android.os.Bundle
import android.text.Editable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.cs4520.assignment3.R
import com.cs4520.assignment3.databinding.MvpCalculatorFragmentBinding
import com.cs4520.assignment3.databinding.MvvmCalculatorFragmentBinding

class ViewFragment : Fragment(), Contract.View {

    private var _binding: MvpCalculatorFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstaceState: Bundle?
    ): View? {
        _binding = MvpCalculatorFragmentBinding.inflate(inflater, container, false)

        // Initialize the presenter that we'll use later when creating eventListeners
        val model = Model()
        val presenter = Presenter(this, model)


        // Setting up the buttons' click listeners
        binding.buttonAdd.setOnClickListener {
            presenter.onAddClicked(
                binding.input1.text.toString(),
                binding.input2.text.toString()
            )
        }

        binding.buttonSubtract.setOnClickListener {
            presenter.onSubtractClicked(
                binding.input1.text.toString(),
                binding.input2.text.toString()
            )
        }

        binding.buttonMultiply.setOnClickListener {
            presenter.onMultiplyClicked(
                binding.input1.text.toString(),
                binding.input2.text.toString()
            )
        }

        binding.buttonDivide.setOnClickListener {
            presenter.onDivideClicked(
                binding.input1.text.toString(),
                binding.input2.text.toString()
            )
        }

        return binding.root
    }

    override fun showResult(result: String) {
        binding.resultField.visibility = View.VISIBLE
        binding.resultField.text = result
    }

    override fun showError(message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

    override fun clearInputs() {
        binding.input1.text.clear()
        binding.input2.text.clear()
    }

}