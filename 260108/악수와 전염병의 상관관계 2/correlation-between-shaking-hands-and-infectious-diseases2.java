import java.util.Scanner;
public class Main {
    public static int K;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        K = sc.nextInt();
        int P = sc.nextInt();
        int T = sc.nextInt();

        Developer[] developers = new Developer[100];

        for (int i = 1; i <= N; i++) {
            developers[i] = new Developer(i, false, 0);
        }

        developers[P].infect();

        int[][] arr = new int[251][2];

        for (int i = 0; i < T; i++) {
            int t = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            arr[t] = new int[]{x, y};
        }
        // Please write your code here.

        for (int i = 1; i < 251; i++) {
            if (arr[i][0] != 0 && arr[i][1] != 0) {
                developers[arr[i][0]].contag(developers[arr[i][1]]);
            }
        }

        for (Developer d : developers) {
            if (d != null) {
                int ans = 0;
                if (d.isInfect) ans = 1;
                System.out.print(ans);
            }
        }
    }

    public static class Developer {
        int index;
        boolean isInfect;
        int k;

        public Developer(int index, boolean isInfect, int k) {
            this.index = index;
            this.isInfect = isInfect;
            this.k = k;
        }

        public void infect() {
            this.isInfect = true;
            this.k = K;
        }

        public void contag(Developer y) {
            if (this.k > 0) {
                this.k--;
                if (!y.isInfect) {
                    y.infect();
                }
            }
        }
    }
}