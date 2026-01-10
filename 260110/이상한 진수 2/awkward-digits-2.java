import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        // Please write your code here.
        
        
        int max = 0;
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            String change = c == '0' ? "1" : "0";
            String head = a.substring(0, i);
            String tail = a.substring(i + 1, a.length());
            String result = head + change + tail;
            max = Math.max(max, Integer.parseInt(result, 2));
        }

        System.out.println(max);
    }
}