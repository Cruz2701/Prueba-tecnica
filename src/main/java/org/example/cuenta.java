package org.example;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import static java.util.concurrent.TimeUnit.SECONDS;

public class cuenta {

    public void cuenta(){
        int segundos = 60;

        for (segundos=60; segundos>0; segundos--){
            System.out.println(segundos);
            borrarsegundo();
        }

    }
    private static void borrarsegundo(){
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){}
    }
}


