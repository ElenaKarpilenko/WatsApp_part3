package com.example.watsapp

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.watsapp.databinding.FragmentContactsBinding
import com.example.watsapp.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {

    private lateinit var binding: FragmentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        binding = FragmentDetailBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getData()
    }

    private fun getData() {
        Log.d("data","data")
        val model = arguments?.getSerializable(
            "model",
        ) as PhoneNumber
        binding.apply {
            tvDatailName.text = model.name
            tvDatailNumber.text = model.number
            imgDatail.loadImage(model.image)
        }
    }

}
