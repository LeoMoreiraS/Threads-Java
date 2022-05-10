package com.company;
import java.lang.Thread;
import java.util.logging.Logger;
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


        AsyncSum a = new AsyncSum();
        int result = a.sum(arr);
        System.out.println(result);
    }
}
