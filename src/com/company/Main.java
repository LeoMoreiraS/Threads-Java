package com.company;
import java.lang.Thread;
public class Main {

    public static void main(String[] args) {

        TestThread a = new TestThread("Thread-1");
        TestThread b = new TestThread("Thread-2");
        TestThread c = new TestThread("Thread-3");
        TestThread d = new TestThread("Thread-4");
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        Thread t3 = new Thread(c);
        Thread t4 = new Thread(d);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
