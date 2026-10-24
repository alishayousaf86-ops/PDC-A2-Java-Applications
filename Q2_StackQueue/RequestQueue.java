public class RequestQueue {
    char[] data = new char[100];
    int front = 0, rear = -1;
    public void enqueue(char ch) {
        data[++rear] = ch;
    }
    public char dequeue() {
        return data[front++];
    }
    public boolean isEmpty() {
        return front > rear;
    }
}
