public class TransactionStack {
    char[] data = new char[100];
    int top = -1;

    public void push(char ch) {
        if (top == data.length - 1) {
            System.out.println("Stack is full!");
            return;
        }
        data[++top] = ch;
    }

    public char pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return '\0';
        }
        return data[top--];
    }

    public char peek() {
        if (isEmpty()) {
            return '\0';
        }
        return data[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}