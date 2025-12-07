package com.example.cleantodoapp.data

import androidx.room.Database
import androidx.room.RoomDatabase   // ✅ Important import

@Database(entities = [TodoEntity::class], version = 1, exportSchema = false)
abstract class TodoDatabase : RoomDatabase() {   // Class name fixed
    abstract fun todoDao(): TodoDao
}
