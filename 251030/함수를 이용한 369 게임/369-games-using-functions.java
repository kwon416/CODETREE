import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        // Please write your code here.
        int count = 0;
        for (int i = A; i <= B; i++) {
            if (has369(i) || mul3(i)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean has369(int i) {
        while (true) {
            int j = i % 10;
            if (j == 3 || j == 6 || j == 9) {
                return true;
            }

            
            if (i < 10) return false;
            i /= 10;
            
        }
        
    }

    public static boolean mul3(int i) {
        return i % 3 == 0;
    }
}