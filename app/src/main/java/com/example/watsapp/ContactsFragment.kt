package com.example.watsapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.watsapp.databinding.FragmentContactsBinding

class ContactsFragment() : Fragment() {

    private lateinit var binding: FragmentContactsBinding
    private var contacts = ArrayList<PhoneNumber>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentContactsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
        loadData()
    }

    private fun initAdapter() {
        binding.rvContacts.adapter = ContactAdapter(contacts,this::onClick)
    }

    fun loadData() {
        contacts.add(
            PhoneNumber(
                "https://thumbs.dreamstime.com/b/d-icon-avatar-business-woman-illustration-smiling-happy-girl-cartoon-close-up-portrait-standing-teenager-isolated-277029066.jpg",
                "Elena",
                "0550104030"
            )
        )
        contacts.add(
            PhoneNumber(
                "https://thumbs.dreamstime.com/b/d-icon-avatar-business-woman-illustration-smiling-happy-girl-cartoon-close-up-portrait-standing-teenager-isolated-277029066.jpg",
                "vira",
                "0550104030"
            )
        )
        contacts.add(
            PhoneNumber(
                "https://thumbs.dreamstime.com/b/d-icon-avatar-business-woman-illustration-smiling-happy-girl-cartoon-close-up-portrait-standing-teenager-isolated-277029066.jpg",
                "Саша",
                "0550104030"
            )
        )
        contacts.add(
            PhoneNumber(
                "https://thumbs.dreamstime.com/b/d-icon-avatar-business-woman-illustration-smiling-happy-girl-cartoon-close-up-portrait-standing-teenager-isolated-277029066.jpg",
                "Генаa",
                "0550104030"
            )
        )
        contacts.add(
            PhoneNumber(
                "https://thumbs.dreamstime.com/b/d-icon-avatar-business-woman-illustration-smiling-happy-girl-cartoon-close-up-portrait-standing-teenager-isolated-277029066.jpg",
                "Дарика",
                "0550104030"
            )
        )
        contacts.add(
            PhoneNumber(
                "https://thumbs.dreamstime.com/b/d-icon-avatar-business-woman-illustration-smiling-happy-girl-cartoon-close-up-portrait-standing-teenager-isolated-277029066.jpg",
                "Шурик",
                "0550104030"
            )
        )
        contacts.add(
            PhoneNumber(
                "https://thumbs.dreamstime.com/b/d-icon-avatar-business-woman-illustration-smiling-happy-girl-cartoon-close-up-portrait-standing-teenager-isolated-277029066.jpg",
                "Сезега",
                "0550104030"
            )
        )
        contacts.add(
            PhoneNumber(
                "https://thumbs.dreamstime.com/b/d-icon-avatar-business-woman-illustration-smiling-happy-girl-cartoon-close-up-portrait-standing-teenager-isolated-277029066.jpg",
                "МИша",
                "0550104030"
            )
        )
        contacts.add(
            PhoneNumber(
                "https://thumbs.dreamstime.com/b/d-icon-avatar-business-woman-illustration-smiling-happy-girl-cartoon-close-up-portrait-standing-teenager-isolated-277029066.jpg",
                "пппппп",
                "0550104030"
            )
        )
        contacts.add(
            PhoneNumber(
                "https://thumbs.dreamstime.com/b/d-icon-avatar-business-woman-illustration-smiling-happy-girl-cartoon-close-up-portrait-standing-teenager-isolated-277029066.jpg",
                "Eля",
                "0550104030"
            )
        )
        contacts.add(
            PhoneNumber(
                "https://thumbs.dreamstime.com/b/d-icon-avatar-business-woman-illustration-smiling-happy-girl-cartoon-close-up-portrait-standing-teenager-isolated-277029066.jpg",
                "Elа",
                "0550104030"
            )
        )
        contacts.add(
            PhoneNumber(
                "https://thumbs.dreamstime.com/b/d-icon-avatar-business-woman-illustration-smiling-happy-girl-cartoon-close-up-portrait-standing-teenager-isolated-277029066.jpg",
                "Колян",
                "0550104030"
            )
        )
        contacts.add(
            PhoneNumber(
                "https://thumbs.dreamstime.com/b/d-icon-avatar-business-woman-illustration-smiling-happy-girl-cartoon-close-up-portrait-standing-teenager-isolated-277029066.jpg",
                "Марс",
                "0550104030"
            )
        )
        contacts.add(
            PhoneNumber(
                "https://thumbs.dreamstime.com/b/d-icon-avatar-business-woman-illustration-smiling-happy-girl-cartoon-close-up-portrait-standing-teenager-isolated-277029066.jpg",
                "Elena",
                "0550104030"
            )
        )
        contacts.add(
            PhoneNumber(
                "https://thumbs.dreamstime.com/b/d-icon-avatar-business-woman-illustration-smiling-happy-girl-cartoon-close-up-portrait-standing-teenager-isolated-277029066.jpg",
                "Elena",
                "0550104030"
            )
        )
        contacts.add(
            PhoneNumber(
                "https://thumbs.dreamstime.com/b/d-icon-avatar-business-woman-illustration-smiling-happy-girl-cartoon-close-up-portrait-standing-teenager-isolated-277029066.jpg",
                "Elena",
                "0550104030"
            )
        )
    }
    private fun onClick(model: PhoneNumber) {
        findNavController().navigate(R.id.chatFragment, bundleOf("model" to model))
    }

}



