package Package3;
public class linearQueueImplementation {
    private int maxSize;
    private int front;
    private int rear;
    private int[] queueArray;

    public linearQueueImplementation(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = -1;
        rear = -1;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue element: " + value);
        } else {
            if (isEmpty()) {
                front = 0;
            }
            rear++;
            queueArray[rear] = value;
            System.out.println("Enqueued element: " + value);
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue element.");
            return -1;
        } else {
            int dequeuedElement = queueArray[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
            System.out.println("Dequeued element: " + dequeuedElement);
            return dequeuedElement;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek element.");
            return -1;
        } else {
            int peekedElement = queueArray[front];
            System.out.println("Peeked element: " + peekedElement);
            return peekedElement;
        }
    }

    public boolean isFull() {
        return rear == maxSize - 1;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public static void main(String[] args) {
        linearQueueImplementation queue = new linearQueueImplementation(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        queue.enqueue(60); // Queue is full

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        queue.dequeue(); // Queue is empty

        queue.peek(); // Queue is empty
    }
}

