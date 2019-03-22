package com.example.camaraslucesaccion

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.camaraslucesaccion.POJOS.movie_Results
import com.example.camaraslucesaccion.POJOS.moviesSearch
import com.google.gson.Gson
import java.net.URL

class MoviesActivity : AppCompatActivity() {

  /*  var texto : String = ""
    var titulo : String = ""
    var datos : List<movie_Results?>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movies)

        Thread {
            texto = URL("https://api.themoviedb.org/3/search/movie?api_key=39534c06f3f59b461ca70b61f782f06d&query=$titulo").readText()

            this.runOnUiThread {
                datos = Gson().fromJson<moviesSearch>(texto, moviesSearch::class.java).RESULTS
                Log.d("Cosas", datos!![5].toString())
            }
        }.start()


        Log.d("URL", texto)

    }
*/
}
