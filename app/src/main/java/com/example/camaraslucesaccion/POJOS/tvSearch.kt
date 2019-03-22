package com.example.camaraslucesaccion.POJOS

data class tvSearch(

    var PAGE : Int,
    var TOTAL_RESULTS : Int,
    var TOTAL_PAGES : Int,
    var RESULTS : List<tv_Results?>?
)

data class tv_Results(
    var ORIGINAL_NAME : String?,
    var ID : Int,
    var NAME : String?,
    var VOTE_COUNT : Int?,
    var VOTE_AVERAGE : Double?,
    var POSTER_PATH : String?,
    var VIDEO : Boolean?,
    var FIRST_AIR_DATE : String?,
    var POPULARITY: Double?,
    var GENRE_IDS : List<tv_genre_ids?>?,
    var ORIGINAL_LANGUAGE : String?,
    var BACKDROP_PATH : String?,
    var OVERVIEW : String?,
    var ORIGIN_COUNTRY : List<origin_country?>?
)

data class tv_genre_ids(var ID : Int? )

data class origin_country(var ID: Int?)