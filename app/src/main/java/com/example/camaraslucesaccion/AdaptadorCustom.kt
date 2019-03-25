package com.example.camaraslucesaccion

import android.net.Uri
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.camaraslucesaccion.Utilidades.Movie
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.template_movie_details.view.*
import java.net.URI

class AdaptadorCustom(activity: MainActivity, items:ArrayList<Movie>): RecyclerView.Adapter<AdaptadorCustom.ViewHolder>(){

    var items:ArrayList<Movie>? = null

    var viewHolder: ViewHolder? = null

    val activity = activity

    init{
        this.items = items
    }


    override fun getItemCount(): Int {
        return this.items?.count()!!
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdaptadorCustom.ViewHolder{
        val vista = LayoutInflater.from(parent?.context).inflate(R.layout.template_movie_details, parent, false)
        viewHolder = ViewHolder(vista)

        return viewHolder!!
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items?.get(position)
        holder.titulo?.text = item?.title
        Picasso.with(activity).load(item?.poster).into(holder.poster)

    }


    class ViewHolder(vista: View): RecyclerView.ViewHolder(vista){

        var poster: ImageView? = null

        var titulo: TextView? = null

        init {
            poster = vista.ivPoster
            titulo = vista.tvTitle
        }

    }

}