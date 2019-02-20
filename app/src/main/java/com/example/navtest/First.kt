package com.example.navtest

import android.content.Context
import android.content.res.Configuration
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController


class First : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)
//        val model = activity?.let { ViewModelProviders.of(it).get(MyViewModel::class.java)}
        (view.findViewById(R.id.button) as Button).setOnClickListener {
            view.findNavController().navigate(R.id.action_first_to_second)
        }

        return view
    }
}
