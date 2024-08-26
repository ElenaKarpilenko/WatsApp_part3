package com.example.watsapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.watsapp.databinding.ItemContactsBinding

class ContactAdapter(
    private var characterList: List<PhoneNumber>,
    private val onClick: (model: PhoneNumber) -> Unit
) :
    RecyclerView.Adapter<ContactAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemContactsBinding.inflate(
                LayoutInflater.from(
                    parent.context
                ), parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = characterList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(characterList[position])
    }

    inner class ViewHolder(private var binding: ItemContactsBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(phoneNumber: PhoneNumber) {
            binding.apply {
                tvContacts.text = phoneNumber.name
                tvNumber.text = phoneNumber.number
                imgContact.loadImage(phoneNumber.image)
                itemView.setOnClickListener() {
                    onClick(phoneNumber)
                }
            }
        }
    }
}