import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] names = new String[n];
        String[] addresses = new String[n];
        String[] regions = new String[n];
        User[] users = new User[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            addresses[i] = sc.next();
            regions[i] = sc.next();
            users[i] = new User(names[i], addresses[i], regions[i]);
        }
        // Please write your code here.

        Arrays.sort(names, Collections.reverseOrder());

        for (User user : users) {
            if (user.name.equals(names[0])) {
                System.out.println("name " + user.name);
                System.out.println("addr " + user.address);
                System.out.println("city " + user.region);
                return;
            }
        }
    }
}

class User {
    String name;
    String address;
    String region;

    public User(String name, String address, String region) {
        this.name = name;
        this.address = address;
        this.region = region;
    }
}