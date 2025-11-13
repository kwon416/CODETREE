import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        String[] names = new String[n];
        int[] heights = new int[n];
        double[] weights = new double[n];

        User[] users = new User[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            heights[i] = sc.nextInt();
            weights[i] = sc.nextDouble();
            users[i] = new User(names[i], heights[i], weights[i]);
        }
        // Please write your code here.
        Arrays.sort(users);
        System.out.println("name");
        for (User user : users) {
            System.out.println(user.toString());
        }
        System.out.println();
        Arrays.sort(users, (a, b) -> b.height - a.height);

        System.out.println("height");
        for (User user : users) {
            System.out.println(user.toString());
        }
    }
}

class User implements Comparable<User> {
    String name;
    int height;
    double weight;

    public User(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(User u) {
        return this.name.compareTo(u.name);
    }

    public String toString() {
        return this.name + " " + this.height + " " + this.weight;
    }
}