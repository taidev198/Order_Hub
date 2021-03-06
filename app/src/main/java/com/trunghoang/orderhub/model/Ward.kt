package com.trunghoang.orderhub.model

import com.google.gson.annotations.SerializedName

class Ward(
    @SerializedName(WARD_CODE)
    val code: String? = null,
    @SerializedName(WARD_NAME)
    val name: String? = null
) {
    companion object {
        const val WARD_CODE = "WardCode"
        const val WARD_NAME = "WardName"
    }
}
