package com.example.cosmeet_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_intro_first.view.textView1
import kotlinx.android.synthetic.main.fragment_intro_first.view.textView2


class fragment_intro_second : Fragment() {
      override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_intro_second, container, false)

          view.textView2.setOnClickListener { Navigation.findNavController(view).navigate(R.id.navigateTointro_thirdFragment) }

          return view
    }


}