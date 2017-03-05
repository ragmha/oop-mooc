
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public Money plus(Money added) {
        int euros = this.euros + added.euros;
        int cents = this.cents + added.cents;

        if (cents > 99) {
            cents -= 100;
            euros++;
        }

        return new Money(euros, cents);
    }

    public boolean less(Money compared) {
        return (100 * euros + cents) < (100 * compared.euros() + compared.cents());
    }

    public Money minus(Money decremented) {
        int euros = this.euros - decremented.euros();
        int cents = this.cents - decremented.cents();

        if(this.less(decremented)) {
            return new Money(0 , 0);
        }

        if (cents < 0) {
            cents += 100;
            euros--;
        }

        return new Money(euros , cents);
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
