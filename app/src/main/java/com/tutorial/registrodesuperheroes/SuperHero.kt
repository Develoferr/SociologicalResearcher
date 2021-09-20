package com.tutorial.registrodesuperheroes

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class SuperHero(val superheroName: String, val alterEgo: String, val bio: String, val power: Float) : Parcelable