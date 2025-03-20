// Generic Method to Swap Elements
class ArrayUtils {
    public static <T> void swapElements(T[] array, int i, int j) {
        if (i < 0 || j < 0 || i >= array.length || j >= array.length) {
            throw new IndexOutOfBoundsException("Invalid index for swapping.");
        }
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

public class SwapDemo {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4};
        System.out.println("Original Integer Array: " + java.util.Arrays.toString(intArray));
        ArrayUtils.swapElements(intArray, 1, 3);
        System.out.println("Swapped Integer Array: " + java.util.Arrays.toString(intArray));

        String[] strArray = {"A", "B", "C", "D"};
        System.out.println("Original String Array: " + java.util.Arrays.toString(strArray));
        ArrayUtils.swapElements(strArray, 0, 2);
        System.out.println("Swapped String Array: " + java.util.Arrays.toString(strArray));
    }
}
