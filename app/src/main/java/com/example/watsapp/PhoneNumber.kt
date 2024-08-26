package com.example.watsapp

import android.os.Parcel
import android.os.Parcelable
import java.io.Serializable

data class PhoneNumber(
    var image: String,
    var name: String,
    var number: String,
) : Serializable,Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(image)
        parcel.writeString(name)
        parcel.writeString(number)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<PhoneNumber> {
        override fun createFromParcel(parcel: Parcel): PhoneNumber {
            return PhoneNumber(parcel)
        }

        override fun newArray(size: Int): Array<PhoneNumber?> {
            return arrayOfNulls(size)
        }
    }
}
