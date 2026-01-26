import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = new char[100 + 1];
        for (int i = 0; i < n; i++) {
            int position = sc.nextInt();
            char ch = sc.next().charAt(0);
            arr[position] = ch;
        }
        // Please write your code here.
        int ans = 0;
        for (int i = 0; i <= 100; i++) {
            if (arr[i] != 'G' && arr[i] != 'H') continue;
            for (int j = i; j <= 100; j++) {
                if (arr[j] != 'G' && arr[j] != 'H') continue;
                int g = 0;
                int h = 0;
                for (int k = i; k <= j; k++) {
                    if (arr[k] == 'G') g++;
                    if (arr[k] == 'H') h++;
                }
                if ((g + h > 0) && g == h || (g != 0 && h == 0) || (g == 0 && h != 0)) {
                    ans = Math.max(ans, j - i);
                }
            }
        }
        System.out.print(ans);
    }
}