package com.company;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Process {

    private int id;
    private boolean complete = false;

    public Process(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public boolean isComplete() {
        return complete;
    }

    //Имитация выполнения процесса
    private void execution(int time) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                for (int i = 1; i <= time; i++) {
                    if (i == 10) {
                        System.out.println("Процесс" + id + "выполнен");
                        complete = true;
                    } else {
                        System.out.println("Выполнение процесса" + id + ": " + Math.floor(i / time) + "%");
                    }
                }
            }
        };

        timer.schedule(task, new Date());
    }

}
