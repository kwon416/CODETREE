import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        // Please write your code here.
        String ans = "";
        
        for (int i = 1; i < a.length(); i++) {
            char c = a.charAt(i);
            if (c == '0') {
                String head = a.substring(0,i);
                String tail = a.substring(i+1, a.length());
                ans = head + "1" + tail;
                System.out.println(Integer.parseInt(ans, 2));
                break;
            }
        }
    }
}