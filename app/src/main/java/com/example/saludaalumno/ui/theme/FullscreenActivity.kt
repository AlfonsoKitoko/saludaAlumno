package com.example.saludaalumno.ui.theme
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import com.example.saludaalumno.R

class FullscreenActivity : ComponentActivity() {
	private lateinit var saludo: TextView
	private lateinit var introNombre: EditText
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.layout_principal)

		val boton:Button=findViewById(R.id.boton)
		saludo=findViewById(R.id.saludo)
		introNombre=findViewById(R.id.nombre)
		boton.setOnClickListener{saludar()}
	}
	private fun saludar(){
		val nombre=introNombre.text.toString()
		val saludos=getString(R.string.saludo)
		val mensaje="$saludos $nombre"
		saludo.text=mensaje
	}
}