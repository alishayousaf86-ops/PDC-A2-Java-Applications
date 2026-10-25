public class RequestQueue {
    char[] data = new char[100];
    int front = 0, rear = -1;

    public void enqueue(char ch) {
        if (rear == data.length - 1) {
            System.out.println("Queue is full!");
            return;
        }
        data[++rear] = ch;
    }

    public char dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return '\0';
        }
        return data[front++];
    }

    public boolean isEmpty() {
        return front > rear;
    }
}