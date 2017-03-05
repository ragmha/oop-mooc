
public class Main {

    public static void printElegantly(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if(i < (array.length -1)) {
                System.out.print(", ");
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

}
