package com.example.camaraslucesaccion

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.camaraslucesaccion.POJOS.movieCredits
import com.example.camaraslucesaccion.POJOS.movieDetails
import com.example.camaraslucesaccion.POJOS.movie_Results
import com.example.camaraslucesaccion.POJOS.moviesSearch
import com.example.camaraslucesaccion.Utilidades.ConnectionSearch
import com.google.gson.Gson
import java.io.FileNotFoundException
import java.lang.NullPointerException
import java.net.URL

class MoviesActivity {

    fun getMovieDetails(): movieDetails? {
        var id: Array<Int>
        var urlPelicula= " "
        var titulo = "Gladiator"
        var title = ""
        val datosPelicula : ArrayList<movieDetails>? = null
        val datosCreditos : ArrayList<movieCredits>? = null
        var urlCreditos = ""

        id = ConnectionSearch().conexion(titulo)!!

        Log.d("ID : ", id.toString())

        var t = Thread {
            try {
                for (i in 0..id.lastIndex) {
                    //Creamos el hilo principal para obtener info de la URL

                    urlPelicula =
                        URL("https://api.themoviedb.org/3/movie/${id[i]}?api_key=39534c06f3f59b461ca70b61f782f06d&language=es-ES").readText()
                    urlCreditos =
                        URL("https://api.themoviedb.org/3/movie/${id[i]}/credits?api_key=39534c06f3f59b461ca70b61f782f06d").readText()

                    datosPelicula!![i] = Gson().fromJson<movieDetails>(urlPelicula, movieDetails::class.java)
                    datosCreditos!![i] = Gson().fromJson<movieCredits>(urlCreditos, movieCredits::class.java)

                }

                Log.d("********Titulo******** ", datosPelicula!![].title)
                Log.d("********ID******** ", datosPelicula[i].id.toString())
                Log.d("*******Director******* ", datosPelicula[i].)
                Log.d("*******Reparto******* ", datosPelicula[i].title)


            }catch (fnfe: FileNotFoundException) {
                Log.d("ERROR: ", "No se ha podido encontrar la película")
            } catch (npe: NullPointerException) {
            }
        }



        t.start()
        t.join()



        return datosPelicula
    }

    fun getMovieCredits(): movieCredits{
        val datosCreditos : ArrayList<movieCredits>? = null
        var urlCreditos = ""
        var id : Int = getMovieDetails()!!.id

    }
}
