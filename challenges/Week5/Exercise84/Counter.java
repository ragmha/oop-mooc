
public class Counter {

    private int value;
    private boolean check;

    public Counter(int startingValue, boolean check) {
        this.value = startingValue;
        this.check = check;
    }

    public Counter(int startingValue) {
        this(startingValue,false);
    }

    public Counter(boolean check) {
        this(0,true);
    }

    public Counter() {
       this(0);
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        increase(1);
    }

    public void increase(int increaseAmount) {
        if (increaseAmount >= 0) {
            this.value += increaseAmount;
        }
    }

    public void decrease() {
        decrease(1);
    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount <  0) {
            return ;
        }
        this.value -= decreaseAmount;

        if (this.check && this.value < 0) {
            this.value = 0;
        }
    }

}
