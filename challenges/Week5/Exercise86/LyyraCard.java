
public class LyyraCard {

    private double balance;

    public LyyraCard(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void loadMoney(double amount) {
        this.balance += amount;
    }

    public boolean pay(double amount) {
        if (balance >= amount){
            this.balance -= amount;
            return true;
        }

        return false;
    }
}
