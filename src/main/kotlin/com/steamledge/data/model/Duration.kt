package com.steamledge.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Duration(
    val employmentDate: String,
    val departureDate: String
)
