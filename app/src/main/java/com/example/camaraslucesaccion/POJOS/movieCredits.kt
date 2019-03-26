package com.example.camaraslucesaccion.POJOS

data class movieCredits(
    val id : Int,
    val cast : Array<Cast>,
    val crew : Array<Crew>
)

data class Cast(
    val cast_id : Int,
    val character : String,
    val credit_id : String,
    val gender : Int?,
    val id : Int,
    val name : String,
    val order : Int,
    val profile_path : String?
)

data class Crew(
    val credit_id: String,
    val deparment : String,
    val gender: Int?,
    val id: Int,
    val job : String,
    val name : String,
    val profile_path: String?
)

