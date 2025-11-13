import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Please write your code here.
        Agent[] agents = new Agent[5];
        for (int i = 0; i < 5; i++) {
            String codeName = sc.next();
            int score = sc.nextInt();
            agents[i] = new Agent(codeName, score);
        }
        int min = 100;
        String name = "";
        for (Agent agent : agents) {
            if (min > agent.score) {
                min = agent.score;
                name = agent.codeName;
            }
        }

        System.out.println(name + " " + min);

    }
}

class Agent{
    String codeName;
    int score;

    public Agent(String codeName, int score) {
        this.codeName = codeName;
        this.score = score;
    }
}