package com.example.foodparcels

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.util.*

@Parcelize
data class Food(val name:String,
                val imgLocation: String,
                val keywords: String,
                val date: String,
                val email: String,
                val rating: Float) : Parcelable