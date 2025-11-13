import java.util.Scanner;
import java.time.*;
import java.time.format.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LocalDate[] dates = new LocalDate[n];
        Day[] days = new Day[n];
        
        for (int i = 0; i < n; i++) {
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();
            // Please write your code here.
            dates[i] = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            days[i] = new Day(date, day, weather);
        }
        int idx = -1;

        for (int i = 0 ; i < n; i++) {
            if (days[i].weather.equals("Rain")) {
                if (idx == -1) {
                    idx = i;
                } else if (dates[i].isBefore(dates[idx])) {
                    idx = i;
                }
            }
        }

        System.out.println(days[idx].toString());
    }
}

class Day {
    String date;
    String day;
    String weather;

    public Day(String date, String day, String weather) {
        this.date = date;
        this.day = day;
        this.weather = weather;
    }

    public String toString() {
        return date + " " + day + " " + weather;
    }
}