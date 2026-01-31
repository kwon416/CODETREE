import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        // Please write your code here.

        int min = 0;

        for (int i = 1; i <= n; i++) {
            boolean appear = false;

            String target = "";
            for (int j = 0; j <= n - i; j++) {
                target = str.substring(j, j + i);

                for (int k = j + i; k <= n - i; k++) {
                    if (str.substring(k, k+i).equals(target)) {
                        appear = true;
                    }
                }
            }
            
            if (appear == false) {
                min = i;
                break;
            }
        }
        System.out.print(min);
    }
}