import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        int ans = 0; 
        int case1 = 0, case2 = 0;


        for(int i = 0; i < n; i++){
            int first = sc.nextInt();
            int second = sc.nextInt();
            // 1. 1이 2를 이기고 2가 3을 이기고 3이 1을 이김
            if (first == 1 && second == 2) {
                case1++;
            } else if (first == 2 && second == 3) {
                case1++;
            } else if (first == 3 && second == 1) {
                case1++;
            }

            // 1이 3을 이기고 3이 2를 이기고 2가 1을 이김
            if (first ==1 && second == 3) {
                case2++;
            } else if (first == 3 && second == 2) {
                case2++;
            } else if (first == 2 && second == 1) {
                case2++;
            }


            
        }

        ans = Math.max(case1, case2);
        
        System.out.print(ans);
        
    }
}