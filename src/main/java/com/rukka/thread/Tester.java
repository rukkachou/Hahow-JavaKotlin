package com.rukka.thread;

public class Tester {
    public static void main(String[] args) {
        // Main Thread
        for (int i = 0; i < 10; i++) {
            System.out.println("main:" + i);
        }

        // Anonymous Thread
        Thread thread = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Thread:" + i);
                    try {
                        sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        thread.start();

        // MyThread
        MyThread myThread = new MyThread();
        myThread.start();

        // Runnable
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Runable:" + i);
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread threadR = new Thread(runnable);
        threadR.start();

        // Runable - Lambda
        /*new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Runable lambda:" + i);
                }
            }
        }).start();*/
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Runable lambda:" + i);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        System.out.println("main end");
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + ":" + i);
            try {
                sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
