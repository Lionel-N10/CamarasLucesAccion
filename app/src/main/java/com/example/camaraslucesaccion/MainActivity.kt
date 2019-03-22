package com.example.camaraslucesaccion

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.camaraslucesaccion.POJOS.movie_Results
import com.example.camaraslucesaccion.POJOS.moviesSearch
import com.example.camaraslucesaccion.Utilidades.ConnectionSearch
import com.google.gson.Gson
import java.net.URL

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            ConnectionSearch().conexion(this)
        }
}
