package com.example.android.todolist;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import com.example.android.todolist.database.TaskEntry;
import com.example.android.todolist.repository.TaskRepository;

public class AddTaskViewModel extends AndroidViewModel {
    private TaskRepository taskRepository;

    public AddTaskViewModel(@NonNull Application application) {
        super(application);
        taskRepository = new TaskRepository(application.getBaseContext());
    }

    public LiveData<TaskEntry> getTask(int taskId) {
        return taskRepository.getTask(taskId);
    }
}
