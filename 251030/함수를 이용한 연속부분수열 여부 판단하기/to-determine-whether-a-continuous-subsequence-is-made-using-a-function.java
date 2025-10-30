import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        for (int i = 0; i < n1; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n2; i++)
            b[i] = sc.nextInt();
        // Please write your code here.
        System.out.println(isConsecutive(a, b));


    }

    static String isConsecutive(int[] a, int[] b) {
        int size = b.length;
        for (int i = 0; i <= a.length - size; i++) {
            boolean find = false;
            for (int j = 0; j < size; j++) {
                
                if (a[i + j] == b[j]) {
                    if (j == size -1) find = true;
                    continue;
                }
                else break;
            }
            if (find) {
                return "Yes";
            }
        }
        return "No";
    }
}