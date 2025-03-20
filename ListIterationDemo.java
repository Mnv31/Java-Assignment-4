public class ListIterationDemo {
    public static void main(String[] args) {
        java.util.List<Integer> numbers = java.util.Arrays.asList(10, 20, 30, 40);

        // a. Simple for loop
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("For loop: " + numbers.get(i));
        }

        // b. Enhanced for loop
        for (int num : numbers) {
            System.out.println("Enhanced for loop: " + num);
        }

        // c. While loop with Iterator
        java.util.Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println("Iterator: " + iterator.next());
        }
    }
}
