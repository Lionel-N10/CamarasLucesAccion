package com.example.camaraslucesaccion

import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import com.example.camaraslucesaccion.Utilidades.Movie
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var peliculas : ArrayList<Movie>? = null

    var lista : RecyclerView? = null
    var layoutManager:RecyclerView.LayoutManager? = null
    var adaptador:AdaptadorCustom? = null

    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            var title : String = MoviesActivity().getMovieDetails()?.original_title!!
            /*var urlImage = */
            Picasso.with(this).load("https://image.tmdb.org/t/p/w500${MoviesActivity().getMovieDetails()?.poster_path}").into(Portada)

            Log.d("Poster Path",MoviesActivity().getMovieDetails()?.poster_path)


            /*peliculas = ArrayList()

            peliculas!!.add(Movie(title ,urlImage))

            lista = findViewById(R.id.lista)
            layoutManager = LinearLayoutManager(this)
            adaptador = AdaptadorCustom(peliculas!!)
            lista?.layoutManager = layoutManager
            lista?.adapter=adaptador*/


        }
}
