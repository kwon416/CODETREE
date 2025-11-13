import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        User[] users = new User[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            // Please write your code here.
            users[i] = new User(name, height, weight);
        }

        Arrays.sort(users);

        for (User u : users) {
            System.out.println(u.toString());
        }
    }
}

class User implements Comparable<User> {
    String name;
    int height;
    int weight;

    public User(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(User u) {
        if (this.height != u.height) {
            return this.height - u.height;
        }
        return u.weight - this.weight;
    }

    public String toString() {
        return this.name + " " + this.height + " " + this.weight;
    }
}