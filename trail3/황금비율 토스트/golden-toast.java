import java.util.Scanner;
import java.util.LinkedList;
import java.util.ListIterator;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        String s = sc.next();
        sc.nextLine();
        
        LinkedList<Character> l = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            l.add(s.charAt(i));
        }

        ListIterator it = l.listIterator(l.size());

        for (int i = 0; i < m; i++) {
            char command = sc.next().charAt(0);

            if (command == 'L') {
                if (it.hasPrevious()) it.previous();
            } else if (command == 'R') {
                if (it.hasNext()) it.next();
            } else if (command == 'D') {
                if (it.hasNext()) {
                    it.next();
                    it.remove();
                }
            } else if (command == 'P') {
                char c = sc.next().charAt(0);
                it.add(c);
            }
        }
        it = l.listIterator();
        while(it.hasNext()) {
            System.out.print(it.next());
        }
        
        // Please write your code here.
    }
}