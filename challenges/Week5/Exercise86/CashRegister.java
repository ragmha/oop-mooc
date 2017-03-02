
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    private static final double ECONOMICAL_PRICE = 2.5;
    private static final double GOURMET_PRICE = 4.0;

    public CashRegister() {
        this.cashInRegister = 1000;
    }

    public double payEconomical(double cashGiven) {
        if (cashGiven >= ECONOMICAL_PRICE){

            this.cashInRegister += ECONOMICAL_PRICE;
            this.economicalSold++;

            return cashGiven - ECONOMICAL_PRICE;
        }
            return cashGiven;
    }

    public boolean payEconomical(LyyraCard card) {
        if (card.balance() >= ECONOMICAL_PRICE){

            this.economicalSold++;
            card.pay(ECONOMICAL_PRICE);

            return true;
        }
            return false;

    }

    public double payGourmet(double cashGiven) {
        if (cashGiven >= GOURMET_PRICE){

            this.cashInRegister += GOURMET_PRICE;
            this.gourmetSold++;

            return cashGiven - GOURMET_PRICE;
        }
            return cashGiven;
    }


    public boolean payGourmet(LyyraCard card) {
        if (card.balance() >= GOURMET_PRICE){
            this.gourmetSold++;
            card.pay(GOURMET_PRICE);
            return true;
        }
            return false;
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum > 0) {
            card.loadMoney(sum);
            this.cashInRegister += sum;
        }
    }


    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
