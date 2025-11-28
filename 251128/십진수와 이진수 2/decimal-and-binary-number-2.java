import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        // Please write your code here.
        int i = Integer.parseInt(binary, 2);
        i *= 17;
        binary = Integer.toBinaryString(i);
        System.out.println(binary);
    }
}