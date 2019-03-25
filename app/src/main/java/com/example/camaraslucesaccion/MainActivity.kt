package com.example.camaraslucesaccion

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import com.example.camaraslucesaccion.POJOS.movieDetails
import com.example.camaraslucesaccion.Utilidades.Movie

class MainActivity : AppCompatActivity() {

    var peliculas : ArrayList<Movie>? = null

    var lista : RecyclerView? = null
    var layoutManager:RecyclerView.LayoutManager? = null
    var adaptador:AdaptadorCustom? = null

    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            var movies : movieDetails = MoviesActivity().getMovieDetails()!!

            //var title : String = MoviesActivity().getMovieDetails()?.original_title!!
            //var urlImage = Picasso.with(this).load("https://image.tmdb.org/t/p/w500${MoviesActivity().getMovieDetails()?.poster_path}").toString()

            Log.d("Poster Path",MoviesActivity().getMovieDetails()?.poster_path)


            peliculas = ArrayList()

            peliculas?.add(Movie(movies.title, "https://image.tmdb.org/t/p/w500${movies.poster_path}"))

            lista = findViewById(R.id.lista)
            layoutManager = LinearLayoutManager(this)
            adaptador = AdaptadorCustom(this, peliculas!!)
            lista?.layoutManager = layoutManager
            lista?.adapter=adaptador


        }
}
