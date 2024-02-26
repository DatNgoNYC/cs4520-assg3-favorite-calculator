package com.cs4520.assignment3.MvvmCalculator

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.cs4520.assignment3.databinding.MvvmCalculatorFragmentBinding

class MvvmCalcFragment : Fragment() {
    // We are useing viewbinding here. These two lines ensure null pointer exceptions by verifying binding is initiated
    private var _binding: MvvmCalculatorFragmentBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: MvvmCalcViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = MvvmCalculatorFragmentBinding.inflate(inflater, container, false)
        return binding.root // returning the root layout file from mvvmcalcfragment.xml
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(MvvmCalcViewModel::class.java)

        // "observe" the LiveData variables we created in ViewModel and update the ui accordingly
        viewModel.result.observe(viewLifecycleOwner, Observer { result ->
            binding.resultField.text = result.toString()
            binding.resultField.visibility = View.VISIBLE
        })

        viewModel.errorMessage.observe(viewLifecycleOwner, Observer { errorMessage ->
            Toast.makeText(context, errorMessage, Toast.LENGTH_SHORT).show()
        })

        // Set up event listeners for each operation button
        binding.buttonAdd.setOnClickListener {
            viewModel.add(
                binding.input1.text.toString().toDouble(),
                binding.input2.text.toString().toDouble()
            )
            clearInput()
        }

        binding.buttonSubtract.setOnClickListener {
            viewModel.subtract(
                binding.input1.text.toString().toDouble(),
                binding.input2.text.toString().toDouble()
            )
            clearInput()
        }

        binding.buttonMultiply.setOnClickListener {
            viewModel.multiply(
                binding.input1.text.toString().toDouble(),
                binding.input2.text.toString().toDouble()
            )
            clearInput()
        }

        binding.buttonDivide.setOnClickListener {
            viewModel.divide(
                binding.input1.text.toString().toDouble(),
                binding.input2.text.toString().toDouble()
            )
            clearInput()
        }

    }

    private fun clearInput() {
        binding.input1.text.clear()
        binding.input2.text.clear()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}