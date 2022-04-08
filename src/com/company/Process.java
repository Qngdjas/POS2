package com.company;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Process {

    private int id;
    private boolean complete = false;

    public Process(int id) {
        this.id = id;
        //createTask();
    }

    public int getId() {
        return id;
    }

    public boolean isComplete() {
        return complete;
    }

    //Имитация выполнения процесса
    public void execution(int time) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int i = 1;
            @Override
            public void run() {
                if (i == time) {
                    System.out.println("Процесс " + id + " выполнен");
                    complete = true;
                    timer.cancel();
                } else {
                    System.out.println("Выполнение процесса " + id + ": " + Math.floor((double) i / time * 100) + "%");
                    i++;
                }
            }
        };
        timer.schedule(task, new Date(), 1000);
    }

}
