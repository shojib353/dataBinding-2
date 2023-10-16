package com.cz.databadaptar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.ActionBar
import androidx.databinding.DataBindingUtil
import com.cz.databadaptar.databinding.FragmentOneBinding

class FragmentOne : Fragment() {
    private lateinit var binding: FragmentOneBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_one,container,false)

        binding.btn.setOnClickListener {
            parentFragmentManager.beginTransaction().replace(R.id.frame,FragmentTwo()).addToBackStack(null).commit()
        }




        return binding.root



    }


}