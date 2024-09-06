package threads;

public class Thread2 extends Thread {
    Counter counter = new Counter();

    public Thread2(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (counter) {
                counter.increment();
                System.out.println("Count: " + counter.getCount() + ", " + "Thread: " + Thread.currentThread().getName());
            }

        }
    }
}
