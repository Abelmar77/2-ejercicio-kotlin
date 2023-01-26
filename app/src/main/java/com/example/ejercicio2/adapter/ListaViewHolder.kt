package com.example.ejercicio2.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.ejercicio2.ListadoRecycle
import com.example.ejercicio2.databinding.ItemArticulosBinding

class ListaViewHolder(view:View):RecyclerView.ViewHolder(view) {

    val binding=ItemArticulosBinding.bind(view)




    fun render(listadoRecycle: ListadoRecycle, onClickListener: (ListadoRecycle) -> Unit) {

        binding.tvNombreArticulo.text=listadoRecycle.articulo
        binding.tvDescripcion.text=listadoRecycle.descripcion
        binding.tvPrecio.text=listadoRecycle.precio
        Glide.with(binding.ivArticulos.context).load(listadoRecycle.imagen).into(binding.ivArticulos)
        itemView.setOnClickListener{onClickListener(listadoRecycle)}

    }




}