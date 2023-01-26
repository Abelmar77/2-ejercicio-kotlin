package com.example.ejercicio2.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ejercicio2.ListadoRecycle
import com.example.ejercicio2.R

class ListaAdapter(private val listaArticulos:List<ListadoRecycle>, private val onClickListener:(ListadoRecycle)->Unit): RecyclerView.Adapter<ListaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListaViewHolder {
        val layoutInflater= LayoutInflater.from(parent.context)
        return ListaViewHolder(layoutInflater.inflate(R.layout.item_articulos, parent, false))

    }

    override fun getItemCount(): Int = listaArticulos.size //devuelce la cantidad de a lista


    override fun onBindViewHolder(holder: ListaViewHolder, position: Int) {

        val item=listaArticulos[position]
        holder.render(item, onClickListener)



    }


}