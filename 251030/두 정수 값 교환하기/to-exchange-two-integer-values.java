import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        Integer m = sc.nextInt();
        // Please write your code here.
        swap(n, m);
        System.out.print(m + " " + n);
    }

    static void swap(Integer a, Integer b) {
        int temp = a.intValue();
        a = b.intValue();
        b = temp;
    }
}