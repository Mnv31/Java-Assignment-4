import java.util.*;

public class ListPerformanceDemo {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        int elements = 100000;

        // a. Adding elements at the beginning
        long start = System.nanoTime();
        for (int i = 0; i < elements; i++) {
            arrayList.add(0, i);
        }
        long end = System.nanoTime();
        System.out.println("ArrayList (Add at Beginning): " + (end - start) / 1_000_000 + " ms");

        start = System.nanoTime();
        for (int i = 0; i < elements; i++) {
            linkedList.add(0, i);
        }
        end = System.nanoTime();
        System.out.println("LinkedList (Add at Beginning): " + (end - start) / 1_000_000 + " ms");

        // b. Removing elements from the middle
        start = System.nanoTime();
        arrayList.remove(elements / 2);
        end = System.nanoTime();
        System.out.println("ArrayList (Remove from Middle): " + (end - start) + " ns");

        start = System.nanoTime();
        linkedList.remove(elements / 2);
        end = System.nanoTime();
        System.out.println("LinkedList (Remove from Middle): " + (end - start) + " ns");

        // c. Iterating through the list
        start = System.nanoTime();
        for (int num : arrayList) {}
        end = System.nanoTime();
        System.out.println("ArrayList (Iteration): " + (end - start) + " ns");

        start = System.nanoTime();
        for (int num : linkedList) {}
        end = System.nanoTime();
        System.out.println("LinkedList (Iteration): " + (end - start) + " ns");
    }
}
