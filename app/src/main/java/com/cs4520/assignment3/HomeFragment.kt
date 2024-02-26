package com.cs4520.assignment3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.homepage_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.mvp_button).setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_mvpCalculatorFragment)
        }

        view.findViewById<Button>(R.id.mvvm_button).setOnClickListener( {
            findNavController().navigate(R.id.action_homeFragment_to_mvvmCalculatorFragment)
        })
    }
}
