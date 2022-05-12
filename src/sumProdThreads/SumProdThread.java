package sumProdThreads;

public class SumProdThread extends Thread{
    private final int[] array;
    private final boolean isProd;
    private int accumulator = 0;

    public int getAccumulator() {
        return accumulator;
    }

    public void setAccumulator(int accumulator) {
        this.accumulator = accumulator;
    }

    public SumProdThread(String name, int[] array, boolean isProd) {
        super(name);
        this.array = array;
        this.isProd = isProd;
    }

    @Override
    public void run() {
        if (isProd) {
            setAccumulator(1);
        }
        for (int i : this.array) {
            if (isProd) {
                setAccumulator(i * getAccumulator());
            } else {
                setAccumulator(i + getAccumulator());
            }
        }

    }



}
