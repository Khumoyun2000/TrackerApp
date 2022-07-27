package com.khusniddinov.trackerapp.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.khusniddinov.trackerapp.R
import com.khusniddinov.trackerapp.databinding.FragmentSetupBinding

class SetupFragment:Fragment(R.layout.fragment_setup) {
    lateinit var binding: FragmentSetupBinding
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        binding=FragmentSetupBinding.inflate(layoutInflater)
//        binding.tvContinue.setOnClickListener {
//            findNavController().navigate(R.id.action_setupFragment_to_runFragment2)
//        }
//
//
//    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentSetupBinding.inflate(inflater)
        binding.tvContinue.setOnClickListener {
            findNavController().navigate(R.id.action_setupFragment_to_runFragment2)
        }
        return binding.root
    }
}