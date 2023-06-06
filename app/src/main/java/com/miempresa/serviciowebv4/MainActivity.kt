package com.miempresa.serviciowebv4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.StrictMode
import android.widget.Toast
import com.android.volley.Response
import com.android.volley.toolbox.JsonArrayRequest
import com.android.volley.toolbox.Volley
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONException

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val policy =
            StrictMode.ThreadPolicy.Builder().permitAll().build()
        StrictMode.setThreadPolicy(policy)

        btnLogear.setOnClickListener(){
            val usuario = txtUsuario.text.toString()
            val clave = txtClave.text.toString()
            val queue = Volley.newRequestQueue(this)
            var url = "http://192.168.213.171:3000/usuarios?"
            url = url + "usuario=" + usuario + "&clave=" + clave

            val strictRequest = JsonArrayRequest(url,
                Response.Listener { response ->
                    try {
                        val valor = response.getJSONObject(0)
                        Toast.makeText(
                            applicationContext,
                            "VAlidaxion de Usuario: " + valor.getString("usuario") +
                                    "con clave: " + valor.getString("clave") + " coorecta",
                            Toast.LENGTH_LONG
                        ).show()


                    } catch (e: JSONException) {
                        Toast.makeText(
                            applicationContext,
                            "Error en las credenciales proporcionadas",
                            Toast.LENGTH_LONG
                        ).show()

                    }
                }, Response.ErrorListener {
                    Toast.makeText(
                        applicationContext,
                        "Compruebe la conexion a Internet",
                        Toast.LENGTH_LONG
                    ).show()
                })
            queue.add(strictRequest)
        }
        btnRegistrar.setOnClickListener {
            // Aquí puedes agregar el código para el botón "Registrar"
            Toast.makeText(
                applicationContext,
                "Registrado",
                Toast.LENGTH_SHORT
            ).show()
        }

        btnSalir.setOnClickListener {
            finish() // Cierra la actividad actual y finaliza la aplicación
        }
    }

}