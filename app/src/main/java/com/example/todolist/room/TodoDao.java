package com.example.todolist.room;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface TodoDao {

    @Insert
    void inserTodo(TodoItem item);
    @Delete
    void deleteTodo(TodoItem item);
    @Query("delete FROM TODO")
    void deleteAllTodo();
    @Update
    void updateTodo(TodoItem item);
}
