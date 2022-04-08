package com.company;

public class Task {

    int processID;
    State processState;
    //Родительский процесс (Pointer)
    //int ParentProcessID;
    //Указатель на следующую задачу
    //int programCounter;

    public Task(Process process) {
        this.processID = process.getId();
    }

    public int getProcessID() {
        return processID;
    }
}
