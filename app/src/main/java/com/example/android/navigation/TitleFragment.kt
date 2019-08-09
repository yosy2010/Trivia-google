package com.example.android.navigation


import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
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

        // enable the option menu
        setHasOptionsMenu(true)

        // return it
        return binding.root
    }

    // this method is called if the setHasOptionMenu is set to true and ti is used to inflate the whole menu
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        // just inflate the menu lay out using the passed inflater
        inflater.inflate(R.menu.option_menu, menu)
    }

    // this method is called when the user taps on an item to decide what to do with hist click
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        // return whatever has the same id in the navController
        return NavigationUI.onNavDestinationSelected(item, view!!.findNavController())
                || super.onOptionsItemSelected(item)
    }

}
