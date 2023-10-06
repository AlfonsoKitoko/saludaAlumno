package com.example.saludaalumno

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class MainActivity : ComponentActivity() {
	private lateinit var saludo: TextView
	private lateinit var introNombre: EditText
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.layout_principal)
		/*val boton:Button=findViewById(R.id.boton)
		saludar=findViewById(R.id.saludo)
		boton.setOnClickListener {saludo()}
		fun saludo(){
			val mensaje="pepe"
			boton.text=mensaje
		}
		/*boton?.setOnClickListener(){
			string(this@MainActivity,R.string.saludo,R.string.introNombre).show()
		}*/*/
		val boton:Button=findViewById(R.id.boton)
		saludo=findViewById(R.id.saludo)
		introNombre=findViewById(R.id.nombre)
		boton.setOnClickListener{saludar()}
	}
	private fun saludar(){
		val nombre=introNombre.text.toString()
		val saludos=getString(R.string.saludo)
		val mensaje="$saludos $introNombre"
		saludo.text=mensaje
	}
}