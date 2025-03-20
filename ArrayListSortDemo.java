import java.util.*;

public class ArrayListSortDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Banana", "Apple", "Orange", "Mango"));
        
        // Sort Alphabetically
        Collections.sort(list);
        System.out.println("Alphabetically Sorted: " + list);
        
        // Sort Reverse Alphabetically
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Reverse Alphabetically Sorted: " + list);
    }
}
