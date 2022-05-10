package com.company;

public class TestThread extends Extension implements Runnable {
    private final String ThreadName;

    public TestThread(String name) {
        ThreadName = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(ThreadName+ " " + i);
        }
        System.out.println("Done");
    }
}
