package com.example.camaraslucesaccion

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.camaraslucesaccion.POJOS.movieDetails
import com.example.camaraslucesaccion.POJOS.movie_Results
import com.example.camaraslucesaccion.POJOS.moviesSearch
import com.example.camaraslucesaccion.Utilidades.ConnectionSearch
import com.google.gson.Gson
import java.io.FileNotFoundException
import java.lang.NullPointerException
import java.net.URL

class MoviesActivity {

    fun getMovieDetails(): ArrayList<String>? {
        var id: Int?
        var texto= " "
        var pelicula: movieDetails? = null
        var titulo = "Gladiator"
        var title = ""
        var datos : ArrayList<String>? = null
        var url :String

        id = ConnectionSearch().conexion(titulo)

        Log.d("ID : ", id.toString())

        var t = Thread {
            try {
                //Creamos el hilo principal para obtener info de la URL
                texto = URL("https://api.themoviedb.org/3/movie/${id.toString()}?api_key=39534c06f3f59b461ca70b61f782f06d&language=es-ES").readText()
                Log.d("Url: ", texto)

                pelicula = Gson().fromJson<movieDetails>(texto, movieDetails::class.java)

                Log.d("Titulo:", pelicula?.original_title)
                Log.d("Calificación:", pelicula?.vote_average.toString())
            } catch (fnfe: FileNotFoundException) {
                Log.d("ERROR: ", "No se ha podido encontrar la película")
            } catch (npe: NullPointerException) {
            }
        }



        t.start()
        t.join()

        datos?.add("https://image.tmdb.org/t/p/w500/${pelicula?.poster_path}")
        datos?.add(title)



        return datos
    }
}
