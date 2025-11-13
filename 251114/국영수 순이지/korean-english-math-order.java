import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] names = new String[n];

        int[] korean = new int[n];
        int[] english = new int[n];
        int[] math = new int[n];
        User[] users = new User[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            korean[i] = sc.nextInt();
            english[i] = sc.nextInt();
            math[i] = sc.nextInt();
            users[i] = new User(names[i], korean[i], english[i], math[i]);
        }
        // Please write your code here.

        Arrays.sort(users, new Comparator<User>() {
            @Override
            public int compare(User a, User b) {
                if (a.english == b.english && a.korean == b.korean) {
                    return b.math - a.math;
                }
                if (a.korean == b.korean) {
                    return b.english - a.english;
                }
                return b.korean - a.korean;
            }
        });

        for (User user : users) {
            System.out.println(user.toString());
        }
    }
}

class User {
    String name;
    int korean;
    int english;
    int math;

    public User(String name, int korean, int english, int math) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    public String toString() {
        return this.name + " " + this.korean + " " + this.english + " " + this.math;
    }

}