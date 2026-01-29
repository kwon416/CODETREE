import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int[] p = new int[n];
        int[] s = new int[n];
        
        for(int i = 0; i < n; i++){
            p[i] = sc.nextInt();
            s[i] = sc.nextInt();
        }
        // Please write your code here.
        int ans = 0;
        for (int i = 0; i < n; i++) {
            Present[] presents = new Present[n];
            for (int j = 0; j < n; j++) {
                presents[j] = new Present(p[j], s[j]);
            }

            presents[i].discount();

            Arrays.sort(presents);
            int nb = b;
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                nb -= presents[j].getPrice();
                if (nb < 0) break;
                cnt++;
            }
            ans = Math.max(ans, cnt);
        }
        System.out.print(ans);
    }

    public static class Present implements Comparable<Present>{
        int p;
        int s;

        public Present(int p, int s) {
            this.p = p;
            this.s = s;
        }

        public int getPrice() {
            return this.p + this.s;
        }

        public void discount() {
            this.p = (int) this.p / 2;
        }

        @Override
        public int compareTo(Present p) {
            return (this.p + this.s) - (p.p + p.s);
        }
    }
}

