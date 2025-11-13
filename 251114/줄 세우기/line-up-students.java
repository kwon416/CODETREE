import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] height = new int[n];
        int[] weight = new int[n];
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
            weight[i] = sc.nextInt();
            students[i] = new Student(height[i], weight[i], i + 1);
        }
        // Please write your code here.
        Arrays.sort(students);

        for(Student s : students) {
            System.out.println(s.height + " " + s.weight + " " + s.number);
        }
    }
}

class Student implements Comparable<Student> {
    int height;
    int weight;
    int number;

    public Student(int height, int weight, int number) {
        this.height = height;
        this.weight = weight;
        this.number = number;
    }

    @Override
    public int compareTo(Student s) {
        if (this.height == s.height && this.weight == s.weight) {
            return this.number - s.number;
        }
        if (this.height == s.height) {
            return s.weight - this.weight;
        }
        return s.height - this.height;
    }
}