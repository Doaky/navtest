package com.example.navtest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController


class Second : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second, container, false)
        // Inflate the layout for this fragment

        (view.findViewById(R.id.button2) as Button).setOnClickListener {
            view?.findNavController()?.navigate(R.id.action_second_to_first)
        }
        return view
    }
}
