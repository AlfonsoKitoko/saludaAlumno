package com.example.saludaalumno
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
	private lateinit var saludo: TextView
	private lateinit var introNombre: EditText
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.layout_principal)
		val boton:Button=findViewById(R.id.boton)
		introNombre=findViewById(R.id.nombre)
		boton.setOnClickListener{saludar()}
	}
	private fun saludar(){
		setContentView(R.layout.layout_2)
		saludo=findViewById(R.id.saludo)
		val nombre=introNombre.text.toString()
		val saludos=getString(R.string.saludo)
		val mensaje="$saludos $nombre"
		saludo.text=mensaje
	}
}