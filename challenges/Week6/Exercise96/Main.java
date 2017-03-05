
public class Main {

    public static int sum(int[] array) {
        int result = 0;
        for(int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result;
    }

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        System.out.println(sum(array));
    }

}
