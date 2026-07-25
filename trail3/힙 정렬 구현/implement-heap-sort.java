import java.util.Scanner;
public class Main {
    public static int n;
    public static int[] arr;

    public static void heapify(int max, int i) {
        int largest = i;
        int l = 2 * i;
        int r = 2 * i + 1;

        if (l <= max && arr[largest] < arr[l]) {
            largest = l;
        }

        if (r <= max && arr[largest] < arr[r]) {
            largest = r;
        }

        if (largest != i) {
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;
            heapify(max, largest);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.

        for (int i = n / 2; i > 0; i--) {
            heapify(n, i);
        }

        for (int i = n; i > 1; i--) {
            int temp = arr[1];
            arr[1] = arr[i];
            arr[i] = temp;
            heapify(i - 1, 1);
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}