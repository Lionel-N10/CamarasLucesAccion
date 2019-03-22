package com.example.camaraslucesaccion.POJOS

data class moviesSearch(

    var PAGE : Int,
    var TOTAL_RESULTS : Int,
    var TOTAL_PAGES : Int,
    var RESULTS : List<movie_Results?>?
)

data class movie_Results(
    var VOTE_COUNT : Int?,
    var ID : Int,
    var VIDEO : Boolean?,
    var VOTE_AVERAGE : Double?,
    var TITLE : String?,
    var POPULARITY: Double?,
    var POSTER_PATH : String?,
    var ORIGINAL_LANGUAGE : String?,
    var ORIGINAL_TITLE : String?,
    var GENRE_IDS : List<movie_genre_ids?>?,
    var BACKDROP_PATH : String?,
    var ADULT : Boolean?,
    var OVERVIEW : String?,
    var REALEASE_DATE : String?
)

data class movie_genre_ids(var ID : Int? )
