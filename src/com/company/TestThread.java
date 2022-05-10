package com.company;

public class TestThread extends Thread {
    private final String ThreadName;
    private int array[];
    public int sum = 0;
    public TestThread(String name, int a[]) {
        ThreadName = name;
        array = a;
    }

    @Override
    public void run() {

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]+" "+sum +" "+ThreadName);
            sum+= array[i];

        }

    }
}
