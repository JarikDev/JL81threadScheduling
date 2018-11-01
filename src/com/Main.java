package com;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws Exception {
        ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor();
        ses.schedule(new MyThread(),3, TimeUnit.SECONDS);
        ses.shutdown();
    }
    static class MyThread extends Thread{
        @Override
        public void run() {
            System.out.println(1);
        }
    }
}
