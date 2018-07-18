package com.example.android.todolist;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class AppExecutors {
    private static final Object LOCK = new Object();
    private static AppExecutors appExecutors;
    private final Executor diskIO;

    private AppExecutors(Executor diskIO) {
        this.diskIO = diskIO;
    }

    public static AppExecutors getInstance() {
        if (appExecutors == null) {
            synchronized (LOCK) {
                appExecutors = new AppExecutors(Executors.newSingleThreadExecutor());
            }
        }
        return appExecutors;
    }

    public Executor diskIO() {
        return diskIO;
    }
}
