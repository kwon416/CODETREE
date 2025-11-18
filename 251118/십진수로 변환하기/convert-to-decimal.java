import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        // Please write your code here.
        int answer = 0;
        for (int i = 0; i < binary.length(); i++) {
            answer = answer * 2 + (int) binary.charAt(i); 
        }
        // System.out.println(answer);
        System.out.print(Integer.parseInt(binary, 2));
    }
}