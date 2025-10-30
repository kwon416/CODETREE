import java.util.Scanner;
public class Main {
    public static String text;
    public static String pattern;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        text = sc.next();
        pattern = sc.next();
        // Please write your code here.

        System.out.println(find());
    }

    static int find() {

        for (int i = 0; i < text.length() - pattern.length() + 1; i++) {
            boolean isMatch = true;
            for (int j = 0; j < pattern.length(); j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    isMatch = false;
                }
            }
            if (isMatch) {
                return i;
            }
        }
        return -1;
    }
}