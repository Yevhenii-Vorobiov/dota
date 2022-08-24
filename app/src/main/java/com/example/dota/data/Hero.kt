package com.example.dota.data

import com.google.gson.annotations.SerializedName

data class Hero(
    @SerializedName("id")
    var id: Int,
    @SerializedName("localized_name")
    var name: String,
    @SerializedName("primary_attr")
    var attribute: String,
    @SerializedName("attack_type")
    var attackType: String,
    @SerializedName("roles")
    var roles: List<String>
)
