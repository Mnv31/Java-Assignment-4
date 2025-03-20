class Stack<T> {
    private java.util.LinkedList<T> list = new java.util.LinkedList<>();

    public void push(T item) {
        list.addFirst(item);
    }

    public T pop() {
        if (list.isEmpty()) {
            throw new java.util.EmptyStackException();
        }
        return list.removeFirst();
    }

    public T peek() {
        if (list.isEmpty()) {
            throw new java.util.EmptyStackException();
        }
        return list.getFirst();
    }
}

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<>();
        intStack.push(10);
        intStack.push(20);
        System.out.println("Peek Integer Stack: " + intStack.peek());
        System.out.println("Pop Integer Stack: " + intStack.pop());

        Stack<String> stringStack = new Stack<>();
        stringStack.push("Hello");
        stringStack.push("World");
        System.out.println("Peek String Stack: " + stringStack.peek());
        System.out.println("Pop String Stack: " + stringStack.pop());
    }
}
