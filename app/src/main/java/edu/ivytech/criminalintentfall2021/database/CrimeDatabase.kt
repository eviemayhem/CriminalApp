package edu.ivytech.criminalintentfall2021.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import edu.ivytech.criminalintentfall2021.Crime

@Database(entities = [Crime ::class], version = 1)
@TypeConverter(CrimeTypeConverters::class)
abstract class CrimeDatabase : RoomDatabase() {
}