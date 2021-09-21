package com.steamledge.data.model

import kotlinx.serialization.Serializable

@Serializable
data class SensitiveStaffInfo(
    val id: String,
    val staffId: String
)
