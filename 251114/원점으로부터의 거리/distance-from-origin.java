import static java.lang.Math.*;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Point[] points = new Point[n];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            points[i] = new Point(x, y, i + 1);
        }
        // Please write your code here.
        Arrays.sort(points);

        for (Point p : points) {
            System.out.println(p.number);
        }

    }
}

class Point implements Comparable<Point> {
    int x;
    int y;
    int number;
    
    public Point(int x, int y, int number) {
        this.x = x;
        this.y = y;
        this.number = number;
    }

    @Override
    public int compareTo(Point p) {
        if (this.getDist() != p.getDist()) {
            return this.getDist() - p.getDist();
        }
        return this.number - p.number;
    }

    public int getDist() {
        return abs(this.x) + abs(this.y);
    }
}