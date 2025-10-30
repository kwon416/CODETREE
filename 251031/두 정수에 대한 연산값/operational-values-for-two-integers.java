import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.

        IntWrapper aWrapper = new IntWrapper(a);
        IntWrapper bWraaper = new IntWrapper(b);

        calc(aWrapper, bWraaper);

        System.out.println(aWrapper.value + " " + bWraaper.value);

    }

    static void calc(IntWrapper a, IntWrapper b) {
        if (a.value > b.value) {
            a.value += 25;
            b.value *= 2;
        } else {
            a.value *= 2;
            b.value += 25;
        }
    }

    static class IntWrapper {
        public int value;

        IntWrapper(int value) {
            this.value = value;
        }
    }
}
