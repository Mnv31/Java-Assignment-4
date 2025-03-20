import java.util.*;
public class ListOperationsDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // a. Add elements to the list
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("After Adding Elements: " + list);

        // b. Remove an element by value and index
        list.remove("Banana");
        System.out.println("After Removing 'Banana': " + list);
        list.remove(1);
        System.out.println("After Removing Element at Index 1: " + list);

        // c. Replace an element at a specific index
        list.add("Mango");
        list.add("Grapes");
        list.set(1, "Orange");
        System.out.println("After Replacing Element at Index 1: " + list);
    }
}
