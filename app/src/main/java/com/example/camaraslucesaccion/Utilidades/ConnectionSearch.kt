package com.example.camaraslucesaccion.Utilidades

import android.app.Activity
import android.util.Log
import com.example.camaraslucesaccion.POJOS.movie_Results
import com.example.camaraslucesaccion.POJOS.moviesSearch
import com.google.gson.Gson
import java.net.URL

class ConnectionSearch {    //Metodo para realizar la conexion a la URL y obtener datos mediante un JSON

    fun conexion(actividad : Activity) {

        var texto: String = ""
        var titulo: String = "Gladiator"
        var datos: List<movie_Results?>?  //Creamos la variable del tipo que necesitemos dependiendo del POJO
        var id: Int = 0


        Thread { //Creamos el hilo principal para obtener info de la URL
            texto = URL("https://api.themoviedb.org/3/search/movie?api_key=39534c06f3f59b461ca70b61f782f06d&query=$titulo").readText()

            actividad.runOnUiThread { //Usamos este metodo para interactuar con la Interfaz y que no de fallo
                datos = Gson().fromJson<moviesSearch>(texto, moviesSearch::class.java).results //Cargamos los datos del JSON en la variable del tipo que necesitamos.
                                                                                              //Tenemos que especificar que tipo de datos contendra el JSON(en este caso moviesSearch), pasamos la info de la URL y la clase del POJO. results es el tipo de dato que queremos sacar
                for(i in 0..datos!!.lastIndex) {
                    if(titulo == datos!![i]!!.title) //comprobamos que el titulo que buscamos coincida con el que nos devuelve
                        Log.d("ID:", datos!![i]!!.id.toString())
                        Log.d("Titulo:", datos!![i]!!.title.toString())
                        Log.d("Lenguaje:", datos!![i]!!.original_language.toString())
                        id = datos!![i]!!.id //Guardamos la ID en una variable. Esta variable solo guardara la ID dentro del hilo.
                    break
                }
            }
        }.start()



    }

}