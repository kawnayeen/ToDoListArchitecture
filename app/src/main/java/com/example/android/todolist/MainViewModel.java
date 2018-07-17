package com.example.android.todolist;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import com.example.android.todolist.database.AppDatabase;
import com.example.android.todolist.database.TaskEntry;
import com.example.android.todolist.repository.TaskRepository;

import java.util.List;

public class MainViewModel extends AndroidViewModel {
    private TaskRepository taskRepository;

    public MainViewModel(@NonNull Application application) {
        super(application);
        taskRepository = new TaskRepository(application.getBaseContext());
    }

    public LiveData<List<TaskEntry>> getTasks() {
        return taskRepository.getTasks();
    }
}
