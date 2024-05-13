package Package2;
import java.util.Stack;
public class StackUsingArray{
    private int maxSize;
    private Integer[] stackArray;
    private int top;

    public StackUsingArray(int capacity) {
        maxSize = capacity;
        stackArray = (Integer[]) new Object[maxSize];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public void push(Integer value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push element: " + value);
            return;
        }

        top++;
        stackArray[top] = value;
    }

    public Integer pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop element.");
            return null;
        }

         Integer value = stackArray[top];
        top--;
        return value;
    }

    public Integer peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek element.");
            return null;
        }

        return stackArray[top];
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Peek: " + stack.peek());   // Output: 5

        while (!stack.isEmpty()) {
            System.out.println("Pop: " + stack.pop());
        }

        System.out.println("Is stack empty? " + stack.isEmpty());   // Output: true
    }
}
