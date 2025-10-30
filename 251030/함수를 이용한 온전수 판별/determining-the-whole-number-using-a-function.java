import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Please write your code here.
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (isComplete(i)) {
                count++;
            }
        }
        System.out.println(count);
    }

    static boolean isComplete(int i) {
        if (i % 2 == 0) return false;
        if (i % 10 == 5) return false;
        if (i % 3 == 0 && i % 9 != 0) return false;
        return true;
    }
}