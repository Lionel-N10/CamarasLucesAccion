package com.example.camaraslucesaccion.POJOS

data class moviesSearch(

    val page : Int,
    val total_results : Int,
    val total_pages : Int,
    val results : List<movie_Results>
)

data class movie_Results(
    val vote_count : Int,
    val id : Int,
    val video : Boolean,
    val vote_average : Double,
    val title : String,
    val popularity : Double,
    val poster_path : String,
    val original_language : String,
    val original_title : String,
    val genre_ids : List<Int>,
    val backdrop_path : String,
    val adult : Boolean,
    val overview : String,
    val release_date : String
)

