import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String seat = sc.next();
        // Please write your code here.
        int ans = 0;
        for (int i = 0; i < seat.length(); i++) {
            if (seat.charAt(i) == '1') continue;

            String newSeat = seat.substring(0, i) + "1" + seat.substring(i + 1, n);

            int idx = 0;
            int dist = Integer.MAX_VALUE;
            for (int j = 1; j < seat.length(); j++) {
                if (newSeat.charAt(j) == '1') {
                    dist = Math.min(dist, j - idx);
                    idx = j;
                }
            }

            ans = Math.max(ans, dist);
        }
        System.out.print(ans);
    }
}