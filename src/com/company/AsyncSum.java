package com.company;

import java.util.Arrays;

public class AsyncSum {

    public int sum(int a[]){
        int[] a1 = Arrays.copyOfRange(a, 0, a.length/2);
        int[] a2 = Arrays.copyOfRange(a, (a.length/2), a.length);
        TestThread t1 = new TestThread("Thread-1",a1);
        TestThread t2 = new TestThread("Thread-2",a2);

        t1.start();
        t2.start();
        try{
            t2.join();
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return t1.sum + t2.sum;
    }
}
