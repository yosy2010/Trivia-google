package com.example.android.navigation


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.android.navigation.databinding.FragmentTitleBinding


class TitleFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        // create a binding object
        val binding = DataBindingUtil.inflate(inflater, R.layout.fragment_title, container, false) as FragmentTitleBinding

        // navigate to game fragment
        binding.playButton.setOnClickListener { view ->
            view.findNavController().navigate(R.id.action_titleFragment_to_gameFragment)
        }

        // return it
        return binding.root
    }


}
