import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        Number[] numbers = new Number[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            numbers[i] = new Number(arr[i], i + 1);
        }
        // Please write your code here.
        int[] orders = new int[n + 1];
        Arrays.sort(numbers);
        for (int i = 1; i <= n; i++) {
            orders[numbers[i - 1].order - 1] = i;
        }

        for (int o : orders) {
            if (o == 0) return;
            System.out.print(o + " ");
        }
    }
}

class Number implements Comparable<Number> {
    int num;
    int order;

    public Number (int num, int order) {
        this.num = num;
        this.order = order;
    }

    @Override
    public int compareTo(Number n) {
        if (this.num != n.num) {
            return this.num - n.num;
        }
        return this.order - n.order;
    }

}