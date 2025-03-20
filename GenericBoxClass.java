// Generic Box Class
class Box<T> {
    private T item;

    public void addItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class BoxDemo {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.addItem("Hello World");
        System.out.println("String Box contains: " + stringBox.getItem());

        Box<Integer> intBox = new Box<>();
        intBox.addItem(123);
        System.out.println("Integer Box contains: " + intBox.getItem());
    }
}
