package com.example.camaraslucesaccion

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.camaraslucesaccion.Utilidades.Movie
import kotlinx.android.synthetic.main.template_movie_details.view.*

class AdaptadorCustom(items:ArrayList<Movie>): RecyclerView.Adapter<AdaptadorCustom.ViewHolder>(){

    var items:ArrayList<Movie>? = null

    var viewHolder: ViewHolder? = null

    init{
        this.items = items
    }


    override fun getItemCount(): Int {
        return this.items?.count()!!
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items?.get(position)
        holder.titulo?.text = item?.title
        holder.poster?.setImageResource(item?.poster!!)

    }

     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdaptadorCustom.ViewHolder{
        val vista = LayoutInflater.from(parent?.context).inflate(R.layout.template_movie_details, parent, false)
        viewHolder = ViewHolder(vista)

        return viewHolder!!
    }

    class ViewHolder(vista: View): RecyclerView.ViewHolder(vista){
        var vista = vista

        var poster: ImageView? = null

        var titulo: TextView? = null

        init {
            poster = vista.ivPoster
            titulo = vista.tvTitle
        }

    }

}