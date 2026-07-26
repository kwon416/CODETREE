import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        sc.nextLine();

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String command = sc.nextLine();

            if (command.split(" ")[0].equals("push")) {
                q.add(Integer.valueOf(command.split(" ")[1]));
            } else if (command.equals("pop")) {
                System.out.println(q.poll());
            } else if (command.equals("size")) {
                System.out.println(q.size());
            } else if (command.equals("empty")) {
                System.out.println(q.isEmpty() ? 1 : 0);
            } else {
                System.out.println(q.peek());
            }
        }
    }
}