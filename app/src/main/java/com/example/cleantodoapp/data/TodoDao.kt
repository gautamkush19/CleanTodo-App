package com.example.cleantodoapp.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow   // ✅ missing import added

@Dao
interface TodoDao {

    @Query("SELECT * FROM mytodos")
    fun getAllTodos(): Flow<List<TodoEntity>>   // Flow returning list

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(todo: TodoEntity)

    @Update
    suspend fun update(todo: TodoEntity)

    @Delete
    suspend fun delete(todo: TodoEntity)
}
