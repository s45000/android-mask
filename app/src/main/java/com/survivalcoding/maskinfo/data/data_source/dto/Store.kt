package com.survivalcoding.maskinfo.data.data_source.dto

import kotlinx.serialization.Serializable

@Serializable
data class Store(
    val addr: String?,
    val code: String?,
    val created_at: String?,
    val lat: Double?,
    val lng: Double?,
    val name: String?,
    val remain_stat: String? = null,
    val stock_at: String? = null,
    val type: String?
)