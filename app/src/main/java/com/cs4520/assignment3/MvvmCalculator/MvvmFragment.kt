package com.cs4520.assignment3.MvvmCalculator

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.cs4520.assignment3.databinding.MvvmCalculatorFragmentBinding

class MvvmFragment : Fragment() {
    private var _binding: MvvmCalculatorFragmentBinding? = null
    private val binding get() = _binding!!
    private lateinit var mvvmViewModel: MvvmViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = MvvmCalculatorFragmentBinding.inflate(inflater, container, false)
        mvvmViewModel = MvvmViewModel(MvvmModel(), Repository())

        setupButtonListeners()

        return binding.root
    }

    private fun setupButtonListeners() {
        binding.buttonAdd.setOnClickListener{ mvvmViewModel.calculate("add") }
        binding.buttonSubtract.setOnClickListener{ mvvmViewModel.calculate("subtract") }
        binding.buttonMultiply.setOnClickListener{ mvvmViewModel.calculate("multiply") }
        binding.buttonDivide.setOnClickListener{ mvvmViewModel.calculate("divide") }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}