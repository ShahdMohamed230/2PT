package com.example.tilltime

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavAction
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.tilltime.databinding.FragmentWelcomeBinding

class WelcomeFragment : Fragment() {
    lateinit var binding:FragmentWelcomeBinding
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWelcomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
       FragmentWelcomeBinding.bind(view)
        navController = Navigation.findNavController(view)
        binding.btnWelcome.setOnClickListener {
            navController.navigate(R.id.action_welcomeFragment_to_formFragment)
        }
    }
}