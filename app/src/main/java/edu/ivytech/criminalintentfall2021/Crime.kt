package edu.ivytech.criminalintentfall2021

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*


@Entity //Creates table with elements
data class Crime(@PrimaryKey val id: UUID = UUID.randomUUID(),
                 var title:String = "",
                 var date:Date = Date(),
                 var isSolved: Boolean = false)


