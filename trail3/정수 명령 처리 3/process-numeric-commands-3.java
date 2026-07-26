import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        sc.nextLine();

        Deque<String> dq = new ArrayDeque<>();

        for (int i = 0 ; i < n; i++) {
            String c = sc.nextLine();

            if (c.split(" ")[0].equals("push_front")) {
                dq.addFirst(c.split(" ")[1]);
            } else if (c.split(" ")[0].equals("push_back")) {
                dq.addLast(c.split(" ")[1]);
            } else if (c.equals("pop_front")) {
                System.out.println(dq.pollFirst());
            } else if (c.equals("pop_back")) {
                System.out.println(dq.pollLast()); 
            } else if (c.equals("size")) {
                System.out.println(dq.size());
            } else if (c.equals("empty")) {
                System.out.println(dq.isEmpty() ? 1 : 0);
            } else if (c.equals("front")) {
                System.out.println(dq.peekFirst());
            } else {
                System.out.println(dq.peekLast());
            }
        }
    }
}