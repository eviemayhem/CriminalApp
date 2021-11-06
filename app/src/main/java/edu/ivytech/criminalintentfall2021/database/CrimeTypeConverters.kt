package edu.ivytech.criminalintentfall2021.database

import androidx.room.TypeConverter
import java.util.*

class CrimeTypeConverters {


    @TypeConverter
    fun fromDate(date: Date?): Long? {//Converts date to a Long so that it can be stored in database
        return date?.time
    }

    @TypeConverter
    fun toDate(millisSinceEpoch : Long?):Date? { //Tells us the minutes since something occurred.
        return millisSinceEpoch?.let{Date(it)}
    }

    @TypeConverter //Converts UUID to string
    fun fromUUID(uuid: UUID):String?{
        return uuid.toString()
    }

    @TypeConverter //Converts from String back into UUID
    fun toUUID(id:String?):UUID?{
        return UUID.fromString(id)
    }
}