package com.example.saludaalumno

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import com.example.saludaalumno.ui.theme.Activity2

class MainActivity : ComponentActivity() {
	private lateinit var introNombre: EditText
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.layout_principal)
		val boton:Button=findViewById(R.id.boton)
		introNombre=findViewById(R.id.nombre)
		//boton.setOnClickListener{saludar()}
		boton.setOnClickListener{intent=Intent(this,Activity2::class.java).apply {
			putExtra("introNombre",introNombre.text.toString())}
			startActivity(intent)}
	}
	/*private fun saludar(){
		saludo=findViewById(R.id.saludo)
		val nombre=introNombre.text.toString()
		val saludos=getString(R.string.saludo)
		val mensaje="$saludos $nombre"
		saludo.text=mensaje
	}*/
	private fun cambioActividad(){
		intent=Intent(this,Activity2::class.java).apply {
			putExtra("introNombre",introNombre.text.toString())}
		startActivity(intent)
	}
}