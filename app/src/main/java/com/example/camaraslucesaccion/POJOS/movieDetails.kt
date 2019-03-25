package com.example.camaraslucesaccion.POJOS

data class movieDetails(
    val adult : Boolean,
    val backdrop_path : String?,
    val belongs_to_collection: belongs_to_collection?,
    val budget : Int,
    val genres: List<genres>,
    val homepage : String?,
    val id : Int,
    val imdb_id : String?,
    val original_language : String,
    val original_title: String,
    val overview : String?,
    val popularity : Double?,
    val poster_path : String?,
    val production_companies: List<production_companies>,
    val production_countries: List<production_countries>,
    val release_date : String,
    val revenue : Int,
    val runtime : Int?,
    val spoken_languajes : List<spoken_languajes>,
    val status : String,
    val tagline : String?,
    val title : String,
    val video : Boolean,
    val vote_average : Double,
    val vote_count : Int
)

data class belongs_to_collection(
    val id : Int,
    val name : String,
    val poster_path: String?,
    val backdrop_path: String?
)


data class genres(
    val id : Int,
    val name : String
)


data class production_companies(
    val name : String,
    val id: Int,
    val logo_path : String?,
    val origin_country : String
)


data class production_countries(
    val iso_3166_1 : String,
    val name : String
)


data class spoken_languajes(
    val iso_639_1 : String,
    val name : String
)