class CollectionPrinter {
    public static <T> void printCollection(java.util.Collection<T> collection) {
        for (T item : collection) {
            System.out.println(item);
        }
    }
}

public class CollectionPrinterDemo {
    public static void main(String[] args) {
        java.util.List<String> stringList = java.util.Arrays.asList("Lily", "Daisy", "Sunflower");
        java.util.Set<Integer> intSet = java.util.Set.of(1, 2, 3, 4);
        
        System.out.println("Printing String List:");
        CollectionPrinter.printCollection(stringList);

        System.out.println("Printing Integer Set:");
        CollectionPrinter.printCollection(intSet);
    }
}
