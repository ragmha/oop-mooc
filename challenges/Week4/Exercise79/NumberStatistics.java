
public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {
        this.amountOfNumbers = 0;

    }

    public void addNumber(int Number) {
        this.amountOfNumbers++;
        this.sum += Number;

    }

    public int amountOfNumbers(){
        return this.amountOfNumbers;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        if (this.amountOfNumbers == 0) {
            return 0;
        }
        return (double) this.sum / this.amountOfNumbers;
    }
}
