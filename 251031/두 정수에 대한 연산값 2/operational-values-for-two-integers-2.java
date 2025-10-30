import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        IntWrapper A = new IntWrapper(a);
        IntWrapper B = new IntWrapper(b);

        calc(A, B);
        System.out.println(A.value + " " + B.value);
    }

    static void calc(IntWrapper A, IntWrapper B) {
        if (A.value > B.value) {
            A.value *= 2;
            B.value += 10;
        } else {
            A.value += 10;
            B.value *= 2;
        }
    }

    static class IntWrapper {
        public int value;

        IntWrapper(int value) {
            this.value = value;
        }
    }
}