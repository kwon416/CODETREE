import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        User[] users = new User[n];
        for (int i = 0 ; i < n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            users[i] = new User(name, height, weight);
        }

        Arrays.sort(users);

        for (User user : users) {
            System.out.println(user.toString());
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
    public int compareTo(User user) {
        return this.height - user.height;
    }

    public String toString() {
        return this.name + " " + this.height + " " + this.weight;
    }
}