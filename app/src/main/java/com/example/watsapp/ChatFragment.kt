package com.example.watsapp

import android.graphics.Color
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.watsapp.databinding.FragmentChatBinding


class ChatFragment : Fragment() {

    private lateinit var binding: FragmentChatBinding
    private var chatAdapter = ChatAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentChatBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvName.setOnClickListener {
            val phoneNumber = PhoneNumber("imageUrl", "name", "number")
            Log.d("name","${phoneNumber}")
            findNavController().navigate(R.id.action_chatFragment_to_detailFragment, bundleOf("model" to phoneNumber))
        }
        if (arguments != null) {
            val model = arguments?.getSerializable("model") as PhoneNumber
            binding.apply {
                tvName.text = model.name
            }
        }

        binding.rvChat.setLayoutManager(
            GridLayoutManager(requireContext(), 1, LinearLayoutManager.VERTICAL, false)
        )

        binding.rvChat.adapter = chatAdapter
        setupListeners()
    }

    private fun setupListeners() {
        binding.btnChat.setOnClickListener {
            val messageText = binding.etChat.text.toString()
            if (messageText.isNotEmpty()) {
                val message = Model(text = messageText, isSentByUser = true)
                addMessage(message)
                binding.etChat.text.clear()
            }
        }
    }

    private fun addMessage(message: Model) {
        val currentList = chatAdapter.currentList.toMutableList()
        currentList.add(message)
        chatAdapter.submitList(currentList)
        setupTextChangedListener()
    }


    private fun setupTextChangedListener() {
        binding.etChat.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

            override fun afterTextChanged(s: Editable?) {
                checkButtonVisibility()
            }
        })
    }

    private fun checkButtonVisibility() {
        val titleText = binding.etChat.text.toString().trim()

        if (titleText.isNotEmpty()) {
            binding.btnChat.setBackgroundColor(Color.GREEN)
        } else {
            binding.btnChat.setBackgroundColor(Color.BLUE)
        }
    }
    private fun onClick(model: PhoneNumber) {

    }
}