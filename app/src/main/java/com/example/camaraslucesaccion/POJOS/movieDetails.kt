package com.example.camaraslucesaccion.POJOS

data class movie(
    var ADULT : Boolean,
    var BACKDROP_PATH : String?,
    var BELONGS_TO_COLLECTION : belongs_to_collection?,
    var BUDGET : Int,
    var GENRES : List<genres>,
    var HOMEPAGE : String?,
    var ID : Int,
    var IMDB_ID : String?,
    var ORIGINAL_LANGUAGE : String,
    var ORIGINAL_TITLE : String,
    var OVERVIEW : String?,
    var POPULARITY : Double?,
    var POSTER_PATH : String?,
    var PRODUCTION_COMPANIES : List<production_companies>,
    var PRODUCTION_COUNTRIES : List<production_countries>,
    var RELEASE_DATE : String,
    var REVENUE : Int,
    var RUNTIME : Int?,
    var SPOKEN_LANGUAJES : List<spoken_languajes>,
    var STATUS : String,
    var TAGLINE : String?,
    var TITLE : String,
    var VIDEO : Boolean,
    var VOTE_AVERAGE : Double,
    var VOTE_COUNT : Int
)

data class belongs_to_collection(
    var ID : Int,
    var NAME : String,
    var POSTER_PATH: String?,
    var BACKDROP_PATH: String?
)


data class genres(
    var ID : Int,
    var NAME : String
)


data class production_companies(
    var NAME : String,
    var ID: Int,
    var LOGO_PATH : String?,
    var ORIGIN_COUNTRY : String
)


data class production_countries(
    var ISO_3166_1 : String,
    var NAME : String
)


data class spoken_languajes(
    var ISO_639_1 : String,
    var NAME : String
)