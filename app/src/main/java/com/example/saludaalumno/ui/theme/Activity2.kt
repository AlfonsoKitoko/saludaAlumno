package com.example.saludaalumno.ui.theme

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import com.example.saludaalumno.MainActivity
import com.example.saludaalumno.R
class Activity2 : ComponentActivity() {
	//private var introNombre=null
	//private var saludo=null
	private lateinit var saludo:TextView
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		val intent=Intent(this,MainActivity::class.java)
		val introNombre=intent.getStringExtra("introNombre")

		setContentView(R.layout.layout_2)
		saludo=findViewById(R.id.saludo)

		val mensaje="Hola $introNombre"
		saludo.text=mensaje
	}

	/*private fun saludar(){
		setContentView(R.layout.layout_2)
		//saludo=findViewById(R.id.saludo)
		val nombre=introNombre
		val saludos=getString(R.string.saludo)
		val mensaje="$saludos $nombre"
		saludo.text=mensaje
	}*/
}

