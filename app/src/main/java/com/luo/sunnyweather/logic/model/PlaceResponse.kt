package com.luo.sunnyweather.logic.model

import com.google.gson.annotations.SerializedName

/**
 * @author: Luo-DH
 * @date: 5/7/21
 */
data class PlaceResponse(val status: String, val places: List<Place>)

data class Place(
    val name: String, val location: Location,
    @SerializedName("formatted_address") val address: String
)

data class Location(val lng: String, val lat: String)