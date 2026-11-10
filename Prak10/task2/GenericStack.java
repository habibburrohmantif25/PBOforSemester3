import java.util.ArrayList;
import java.util.List;

public class GenericStack<T> {

    private static final String MESSAGE_INVALID_SIZE = "Stack size must be positive";
    private static final String MESSAGE_OVERFLOW_ERROR = "Overflow Error";
    private static final String MESSAGE_UNDERFLOW_ERROR = "Underflow Error";

    private static final int MINIMUM_CAPACITY = 0;
    private static final int DEFAULT_CAPACITY = 3;

    private static final int INTEGER_FIRST = 1;
    private static final int INTEGER_SECOND = 2;
    private static final int INTEGER_THIRD = 3;

    private static final String STRING_FIRST = "Merah";
    private static final String STRING_SECOND = "Kuning";
    private static final String STRING_THIRD = "Hijau";

    private final int maxSize;
    private final List<T> items;

    public GenericStack(int maxSize) {
        if (maxSize <= MINIMUM_CAPACITY) {
            throw new GenericStackException(MESSAGE_INVALID_SIZE);
        }
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
    }

    public void push(T item) {
        if (isFull()) {
            throw new GenericStackException(MESSAGE_OVERFLOW_ERROR);
        }
        items.add(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new GenericStackException(MESSAGE_UNDERFLOW_ERROR);
        }
        return items.remove(items.size() - 1);
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public boolean isFull() {
        return items.size() == maxSize;
    }

    public static class GenericStackException extends RuntimeException {

        private static final long serialVersionUID = 1L;

        public GenericStackException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        testIntegerStack();
        testStringStack();
    }

    private static void testIntegerStack() {
        System.out.println("Pengujian GenericStack tipe Integer:");
        GenericStack<Integer> integerStack = new GenericStack<>(DEFAULT_CAPACITY);
        integerStack.push(INTEGER_FIRST);
        integerStack.push(INTEGER_SECOND);
        integerStack.push(INTEGER_THIRD);

        System.out.println(integerStack.pop());
        System.out.println(integerStack.pop());
        System.out.println(integerStack.pop());
    }

    private static void testStringStack() {
        System.out.println("Pengujian GenericStack tipe String:");
        GenericStack<String> stringStack = new GenericStack<>(DEFAULT_CAPACITY);
        stringStack.push(STRING_FIRST);
        stringStack.push(STRING_SECOND);
        stringStack.push(STRING_THIRD);

        System.out.println(stringStack.pop());
        System.out.println(stringStack.pop());
        System.out.println(stringStack.pop());
    }
}
