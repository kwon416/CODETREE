import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        // Please write your code here.
        int[] daysOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int days1 = 0;
        for (int i = 0; i < m1 - 1; i++) {
            days1 += daysOfMonth[i]; 
        }
        days1 += d1;
        int days2 = 0;
        for (int i = 0; i < m2 - 1; i++) {
            days2 += daysOfMonth[i];
        }
        days2 += d2;
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"}; 
        int diff = days2 - days1;
        while (diff < 0) {
            diff += 7;
        }
        System.out.println(days[diff % 7]);
    }
}