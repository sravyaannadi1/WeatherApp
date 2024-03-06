package com.training.weather

import androidx.annotation.DrawableRes
import java.io.Serializable

data class Weather(@DrawableRes val icon:Int,val time:String, val temp:String): Serializable
