package threads;

public class Bank {
    public int money = 1000;

    synchronized public int getMoney() {
        return money;
    }

    public void setMoney(int money) throws Exception {
        if (money < 1) throw new Exception("Can't get to negative");

        this.money = money;

        System.out.println("Was set to " + this.money);
    }
}