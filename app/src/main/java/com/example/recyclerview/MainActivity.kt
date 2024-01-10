package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var adaptador : AdaptadorContacto
    private lateinit var recycler : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val contactos = mutableListOf(
            Contacto(R.drawable.miguel, "Miguel", "jajaja@gmail.com", 98872375),
            Contacto(R.drawable.juan, "Juan", "jajaja@gmail.com", 98872375),
            Contacto(R.drawable.pepe, "Pepe", "jajaja@gmail.com", 98872375),
            Contacto(R.drawable.rubio, "Rubio", "jajaja@gmail.com", 98872375),
            Contacto(R.drawable.jose, "Joses", "jajaja@gmail.com", 98872375),
            Contacto(R.drawable.dani, "Danis", "jajaja@gmail.com", 98872375),
            Contacto(R.drawable.pepe, "Pepe", "jajaja@gmail.com", 98872375),
            Contacto(R.drawable.rubio, "Rubio", "jajaja@gmail.com", 98872375),
            Contacto(R.drawable.jose, "Joses", "jajaja@gmail.com", 98872375),
            Contacto(R.drawable.dani, "Danis", "jajaja@gmail.com", 98872375),
        )

        adaptador = AdaptadorContacto(contactos)
        recycler = findViewById(R.id.recycler)
        recycler.adapter = adaptador
        recycler.layoutManager = LinearLayoutManager(applicationContext)

    }
}