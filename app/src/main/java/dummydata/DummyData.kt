package com.quiz.dummydata

import com.google.gson.annotations.SerializedName

data class DummyData(
        @SerializedName("im:name")
        var name: ImData,

        @SerializedName("im:image")
        var images: List<ImData>?,

        @SerializedName("im:price")
        var price: ImData
)

data class ImData(
        @SerializedName("label")
        var label: String?,

        @SerializedName("attributes")
        var attributes: Attributes?
) {
    constructor(label: String?) : this(label, null)
}

data class Attributes(
        @SerializedName("amount")
        var amount: Double?,

        @SerializedName("currency")
        var currency: String?,

        @SerializedName("label")
        var label: String?
) {
    constructor(amount: Double?, currency: String?) : this(amount, currency, null)
}
