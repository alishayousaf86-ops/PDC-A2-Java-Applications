import java.util.Scanner;

public class PacketSymmetryAuditor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine().trim().toLowerCase();

        if (word.length() == 0) {
            System.out.println("Please enter a word.");
            sc.close();
            return;
        }

        if (word.length() > 100) {
            System.out.println("Input is too long!");
            sc.close();
            return;
        }

        TransactionStack stack = new TransactionStack();
        RequestQueue queue = new RequestQueue();

        for (char ch : word.toCharArray()) {
            stack.push(ch);
            queue.enqueue(ch);
        }

        boolean same = true;

        while (!stack.isEmpty() && !queue.isEmpty()) {
            if (stack.pop() != queue.dequeue()) {
                same = false;
                break;
            }
        }

        System.out.println(same ? "Palindrome" : "Not a palindrome");
        sc.close();
    }
}