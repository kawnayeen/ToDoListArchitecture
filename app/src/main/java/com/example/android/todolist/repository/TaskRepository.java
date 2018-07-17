package com.example.android.todolist.repository;

import android.arch.lifecycle.LiveData;
import android.content.Context;

import com.example.android.todolist.database.AppDatabase;
import com.example.android.todolist.database.TaskDao;
import com.example.android.todolist.database.TaskEntry;

import java.util.List;

/**
 * Created by kawnayeen on 7/17/18.
 */
public class TaskRepository {
    private TaskDao taskDao;

    public TaskRepository(Context context) {
        taskDao = AppDatabase.getInstance(context).taskDao();
    }

    public LiveData<List<TaskEntry>> getTasks(){
        return taskDao.loadAllTasks();
    }
}
