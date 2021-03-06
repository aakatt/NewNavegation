package com.example.nav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class FragmentThree : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.nav_fragment_three, container, false)

        view.findViewById<Button>(R.id.prev_button).setOnClickListener { Navigation.findNavController(view).navigate(R.id.action_fragmentThree_to_fragmentTwo) }
        view.findViewById<Button>(R.id.next_button).setOnClickListener { Navigation.findNavController(view).navigate(R.id.action_fragmentThree_to_fragmentFour) }

        return view
    }
}