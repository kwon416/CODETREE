import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        // Please write your code here.
        System.out.println(isLeapYear(y));
    }

    public static boolean isLeapYear(int y) {
        if (y % 4 != 0) return false;
        if (y % 100 == 0 && y % 400 != 0) return false;
        return true;
    }
}