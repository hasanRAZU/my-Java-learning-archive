package beginner.prob_1061;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Read input
        String[] lines = new String[4];
        for (int i = 0; i < 4; i++) {
            lines[i] = bufferedReader.readLine();
        }

        // Get starting day
        int startingDay = Integer.parseInt(lines[0].split(" ")[1]);

        // Get starting time
        String[] startTime = lines[1].split(" : ");
        int startingHour = Integer.parseInt(startTime[0]);
        int startingMinute = Integer.parseInt(startTime[1]);
        int startingSecond = Integer.parseInt(startTime[2]);

        // Get ending day
        int endingDay = Integer.parseInt(lines[2].split(" ")[1]);

        // Get ending time
        String[] endTime = lines[3].split(" : ");
        int endingHour = Integer.parseInt(endTime[0]);
        int endingMinute = Integer.parseInt(endTime[1]);
        int endingSecond = Integer.parseInt(endTime[2]);

        // Calculate duration
        int eventDays = endingDay - startingDay;
        int eventHours = endingHour - startingHour;
        int eventMinutes = endingMinute - startingMinute;
        int eventSeconds = endingSecond - startingSecond;

        // Adjust for borrowing
        if (eventSeconds < 0) {
            eventSeconds += 60;
            eventMinutes -= 1;
        }
        if (eventMinutes < 0) {
            eventMinutes += 60;
            eventHours -= 1;
        }
        if (eventHours < 0) {
            eventHours += 24;
            eventDays -= 1;
        }

        System.out.println(eventDays +" dia(s)\n" + eventHours +" hora(s)\n" + eventMinutes +" minuto(s)\n" + eventSeconds +" segundo(s)");
    }
}
