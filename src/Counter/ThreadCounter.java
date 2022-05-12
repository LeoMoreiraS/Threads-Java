package Counter;

public class ThreadCounter extends Thread{
    Counter counter;

    public ThreadCounter(String name, Counter counter) {
        super(name);
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.incrementVariavelInteira();
        }
    }
}
