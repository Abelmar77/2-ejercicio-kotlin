package com.example.ejercicio2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ejercicio2.adapter.ListaAdapter
import com.example.ejercicio2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()

    }

    fun initRecyclerView(){
        val manager=LinearLayoutManager(this)
        val decoration =DividerItemDecoration(this,manager.orientation )

        binding.recycler1.layoutManager=manager
        binding.recycler1.adapter=
            ListaAdapter(ListadoProvider.listaDeRecycle) { listadoRecycle ->
            onItemSelected(
                listadoRecycle
            )
        }
        binding.recycler1.addItemDecoration(decoration)
    }

    fun onItemSelected(listadoRecycle: ListadoRecycle){
            Toast.makeText(this, listadoRecycle.articulo, Toast.LENGTH_SHORT).show()

    }


}