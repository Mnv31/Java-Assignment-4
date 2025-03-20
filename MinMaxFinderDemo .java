class MinMaxFinder<T extends Comparable<T>> {
    private java.util.List<T> list;

    public MinMaxFinder(java.util.List<T> list) {
        this.list = list;
    }

    public T findMin() {
        return java.util.Collections.min(list);
    }

    public T findMax() {
        return java.util.Collections.max(list);
    }
}
public class MinMaxFinderDemo {
    public static void main(String[] args) {
        java.util.List<Integer> intList = java.util.Arrays.asList(3, 5, 7, 2, 8);
        MinMaxFinder<Integer> intFinder = new MinMaxFinder<>(intList);
        System.out.println("Min Integer: " + intFinder.findMin());
        System.out.println("Max Integer: " + intFinder.findMax());

        java.util.List<String> strList = java.util.Arrays.asList("apple", "orange", "banana", "grape");
        MinMaxFinder<String> strFinder = new MinMaxFinder<>(strList);
        System.out.println("Min String: " + strFinder.findMin());
        System.out.println("Max String: " + strFinder.findMax());
    }
}
