import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Task3 {

//    Task 3 - Until New java.time.Year’s Eve
//
//    Create a program that calculates the number of months and days until New Year’s Eve.
//    You can first create one LocalDate object representing today, and one java.time.LocalDate object that
//    represents the examination day.
//
//    Then use the Period class to get a Period between the two dates.
//
//    Print out the number of months and days of the Period object.
//
//    Also try to print out the total number of days until the examination day. Is this possible with
//    Period?
//
//    Try using the class ChronoUnit for this, like:
//    ChronoUnit.DAYS.between(today, newYearsEve);

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate newYearsEve = LocalDate.of(2023,1,01);

        // Går också att lagra periods i intar nedan

        System.out.println("Months: " + Period.between(today, newYearsEve).getMonths() + " Days: " + Period.between(today, newYearsEve).getDays());

        System.out.println(ChronoUnit.DAYS.between(today, newYearsEve));

    }
}
