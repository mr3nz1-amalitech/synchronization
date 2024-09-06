package threads;

public class Counter {
    volatile private int count;

    public int getCount() {
        return count;
    }

    public void increment() {
        this.count++;
    }
}
