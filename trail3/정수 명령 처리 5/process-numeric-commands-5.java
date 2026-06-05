import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;

import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if (command.equals("push_back")) {
                arr.add(Integer.parseInt(st.nextToken()));
            } else if (command.equals("pop_back")) {
                arr.remove(arr.size() - 1);
            } else if (command.equals("size")) {
                System.out.println(arr.size());
            } else if (command.equals("get")) {
                System.out.println(arr.get(Integer.parseInt(st.nextToken()) - 1));
            }
        }
    }
}