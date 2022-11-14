//        Task 4 - Until New Year’s Eve – hours and minutes

//        Create a program that calculates the number of hours until New Year’s Eve.
//
//        Can you also calculate the number of minutes or seconds?
//
//        Tip: Continue using the ChronoUnit class. Now you need to use LocalDateTime since we are now
//        looking at time and not only dates!

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Task4 {
    public static void main(String[] args) {

        LocalDateTime today = LocalDateTime.now();
        LocalDateTime newYearsEve = LocalDateTime.of(2023, Month.JANUARY,1,0,0,0,0);

        System.out.println("\nHours: " + ChronoUnit.HOURS.between(today, newYearsEve));
        System.out.println("Minutes: " + ChronoUnit.MINUTES.between(today, newYearsEve));
        System.out.println("Seconds: " + ChronoUnit.SECONDS.between(today, newYearsEve));

    }
}
