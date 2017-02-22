import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {

    private ArrayList<Integer> numbers;
    private Random random = new Random();
    private int min = 1;
    private int max = 39;

    public LotteryNumbers() {
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        int i = 0;
        int lottery;

        this.numbers = new ArrayList<Integer>();

        while (i < 7)  {
            lottery  = this.random.nextInt(max) + min;
            if (!this.containsNumber(lottery)){
                numbers.add(lottery);
                i++;
            }
        }

    }

    public boolean containsNumber(int number) {
        return this.numbers.contains(number);
    }

}
