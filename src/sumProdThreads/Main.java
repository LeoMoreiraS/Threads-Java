package sumProdThreads;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] arr = new int[50];
        int max = 10;
        int min = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt((max - min) + 1) + min;
        }

        SumProdThread t1 = new SumProdThread("Thread Sum",arr,false);
        SumProdThread t2 = new SumProdThread("Thread Prod",arr,true);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t1.getName() +  " "  + t1.getAccumulator());
        System.out.println(t2.getName() + " " +t2.getAccumulator());
    }

}
