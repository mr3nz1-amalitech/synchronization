package threads;

public class MyThread extends Thread {
    Bank bank = new Bank();

    public MyThread(Bank bank) {
        this.bank = bank;
        System.out.println(this.bank);
    }

    @Override
    public void run() {
        try {
            syncExample();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public void syncExample() throws Exception {
        synchronized (bank) {
            Thread2.sleep(1000);
            bank.setMoney(bank.getMoney() - 600);
        }
    }

    public void syncExample2() throws Exception {
    }
}
