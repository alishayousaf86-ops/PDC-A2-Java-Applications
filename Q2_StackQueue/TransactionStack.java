public class TransactionStack {
    char[] data = new char[100];
    int top = -1;
    public void push(char ch) {
        data[++top] = ch;
    }
    public char pop() {
        return data[top--];
    }
    public char peek() {
    return data[top];
}
    public boolean isEmpty() {
        return top == -1;
    }
}
