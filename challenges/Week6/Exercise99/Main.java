
public class Main {

    public static void printArrayAsStars(int[] array) {
        for(int i = 0 ; i < array.length ; i++) {
            int numStars = array[i];

            for (int j = 0; j < numStars ; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

}
