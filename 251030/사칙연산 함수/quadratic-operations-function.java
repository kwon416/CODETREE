import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();
        // Please write your code here.
        if (o == '+' || o == '-' || o == '*' || o == '/') {
            System.out.println(calc(a, o ,c));
            return;
        }
        System.out.println("False");
            
        

    }

    static String calc(int a, char o, int b) {

        if (o == '+') return a + " + " + b + " = " + (a + b);
        if (o == '-') return a + " - " + b + " = " + (a - b);
        if (o == '*') return a + " * " + b + " = " + (a * b);
        if (o == '/') return a + " / " + b + " = " + (a / b);
        return "";
    }
}