package com.cs4520.assignment3.MvpCalculator

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.cs4520.assignment3.R

class View : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstaceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.mvp_calculator_fragment, container, false);
    }
}