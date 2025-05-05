import java.util.*;

public class zOutcome_Question {

    public static String findMaxTimeGap(String[] timeArray) {
        // Store the start and end times in minutes
        List<Integer> startTimes = new ArrayList<>();
        List<Integer> endTimes = new ArrayList<>();
        
        for (String event : timeArray) {
            String[] parts = event.split(":");
            int start = convertToMinutes(parts[0], parts[1]);
            int end = convertToMinutes(parts[2], parts[3]);
            startTimes.add(start);
            endTimes.add(end);
        }

        // Sort start and end times
        Collections.sort(startTimes);
        Collections.sort(endTimes);

        // Compute gaps
        int maxGap = 0;
        int n = startTimes.size();

        for (int i = 0; i < n - 1; i++) {
            int gap = startTimes.get(i + 1) - endTimes.get(i);
            if (gap > maxGap) {
                maxGap = gap;
            }
        }

        // Consider the gap from the last end time to the first start time of the next day
        int wrapAroundGap = (24 * 60 - endTimes.get(n - 1)) + startTimes.get(0);
        if (wrapAroundGap > maxGap) {
            maxGap = wrapAroundGap;
        }

        // Convert the max gap from minutes to 12-hour format
        return convertMinutesTo12HourFormat(maxGap);
    }

    private static int convertToMinutes(String hour, String period) {
        int hours = Integer.parseInt(hour);
        if (period.equals("PM") && hours != 12) {
            hours += 12;
        } else if (period.equals("AM") && hours == 12) {
            hours = 0;
        }
        return hours * 60;
    }

    private static String convertMinutesTo12HourFormat(int minutes) {
        int hours = minutes / 60;
        minutes = minutes % 60;

        // Handle the case where hours are 0 or 24
        if (hours == 24) {
            hours = 0;
        }
        
        String period = (hours < 12) ? "AM" : "PM";
        if (hours == 0) {
            hours = 12;
        } else if (hours > 12) {
            hours -= 12;
        }

        return String.format("%d:%02d%s", hours, minutes, period);
    }

    public static void main(String[] args) {
        String[] timeArray = {"11:00AM:12:30PM","10:00AM:10:30AM", "1:30PM:2:30PM"};
        System.out.println("Max time gap: " + findMaxTimeGap(timeArray)); // Output should be "01:00PM"
    }
}
