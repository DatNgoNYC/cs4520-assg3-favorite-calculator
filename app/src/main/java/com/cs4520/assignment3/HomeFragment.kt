package com.cs4520.assignment3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.cs4520.assignment3.databinding.HomepageFragmentBinding
import com.cs4520.assignment3.databinding.MvpCalculatorFragmentBinding

class HomeFragment : Fragment() {

    private var _binding: HomepageFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = HomepageFragmentBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.mvpButton.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_mvpCalculatorFragment)
        }

        binding.mvvmButton.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_mvvmCalculatorFragment)
        }
    }
}
