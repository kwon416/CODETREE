import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id2 = sc.next();
        int code2 = sc.nextInt();
        // Please write your code here.
        Product p1 = new Product("codetree", 50);
        Product p2 = new Product(id2, code2);

        System.out.println("product " + p1.code + " is " + p1.id);
        System.out.println("product " + p2.code + " is " + p2.id);
    }
}

class Product {
    String id;
    int code;

    public Product(String id, int code) {
        this.id = id;
        this.code = code;
    }
}