
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        NumberStatistics stats = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();
        int number = 0;
        System.out.println("Type numbers: ");

        while(number != -1){
            number = Integer.parseInt(reader.nextLine());
            if (number == -1) {
                break;
            }
            if (number%2 == 0) {
                even.addNumber(number);
            }else {
                odd.addNumber(number);
            }

            stats.addNumber(number);
        }

        System.out.println("sum: " + stats.sum());
        System.out.println("sum of even: " + even.sum());
        System.out.println("sum of odd: " + odd.sum());

    }

}
