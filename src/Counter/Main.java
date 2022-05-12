package Counter;


import java.util.Random;

public class Main {
    public static void main(String[] args) {
            Counter c = new Counter();
            ThreadCounter t1 = new ThreadCounter("Thread1",c);
            ThreadCounter t2 = new ThreadCounter("Thread2",c);

            t1.start();
            t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(c.getVariavelInteira());

    }

}
