import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }
        // Please write your code here.
        int even = 0 , odd = 0;
        for (int i = 0; i < N; i++) {
            if (numbers[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        int groupNum = 0;
        while (true) {
            if (groupNum % 2 == 0) { // 짝수 묶음 짝수 1개 , 홀수 2개
                if (even > 0) {
                    even--;
                    groupNum++;
                } else if (odd >= 2) {
                    odd -= 2;
                    groupNum++;
                } else { // 그룹을 만들지 못하는 상황
                    // 그룹의 개수를 하나 줄이기
                    if (even > 0 || odd > 0) {
                        groupNum--;
                    }
                    break;
                }
            } else { // 홀수 묶음 // 홀수 1개
                if (odd > 0) {
                    odd--;
                    groupNum++;
                } else {
                    // 그룹을 만들지 못하는 상황
                    break;
                }
            }
        }
        System.out.print(groupNum);
    }
}