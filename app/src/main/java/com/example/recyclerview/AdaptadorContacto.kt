package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.example.recyclerview.databinding.ItemContactoBinding

class AdaptadorContacto(var lista: MutableList<Contacto>) :
    RecyclerView.Adapter<AdaptadorContacto.ViewHolder>() {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val binding = ItemContactoBinding.bind(view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_contacto, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return lista.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val contacto = lista.get(position)

        holder.binding.apply {
            nombre.text = contacto.nombre
            imagen.setImageResource(contacto.imagen)
            numero.text = contacto.numero.toString()
            gmail.text = contacto.gmail
        }
    }
}