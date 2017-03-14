import java.util.Arrays;

public class Main {

    public static int smallest(int[] array) {
        int min = array[0];
        for (int values : array) {
            min = min < values ? min : values;
        }
        return min;
    }

    public static int indexOfTheSmallest(int[] array) {
        int smallestIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < array[smallestIndex]) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int smallestIndex = index;
        for (int i = index; i < array.length; i++) {
            if(array[i] < array[smallestIndex] ) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int oldIndex1 = array[index1];
        array[index1] = array[index2];
        array[index2] = oldIndex1;
    }

    public static void sort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            int smallestIndex = indexOfTheSmallestStartingFrom(array, i);
            swap(array,i,smallestIndex);
        }
    }


    public static void main(String[] args) {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
        System.out.println(Arrays.toString(values));
    }

}
