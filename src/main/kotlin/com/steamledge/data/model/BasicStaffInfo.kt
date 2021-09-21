package com.steamledge.data.model

import kotlinx.serialization.Serializable

@Serializable
data class BasicStaffInfo(
    val id: Int,
    val staffId: String,
    val fullName: String,
    val age: Int,
    val gender: String,
    val photo: String,
    val jobTitle: String,
    val jobDescription: String,
    val resign: Boolean,
    val sacked: Boolean,
    val duration: Duration
)
