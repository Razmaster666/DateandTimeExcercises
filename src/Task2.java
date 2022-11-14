import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Task2 {

//    Task 2 - LocalDateTime
//    Create a program that prints out:
//
//            • the current month (as text, like JANUARY)
//            • the date of today (as a number, like 21)
//            • the date and time 6 months, 2 days and 7 hours from now, and with a format that
//            matches these examples:
//
//                 o "Fri, July 23 2021" (or with a Swedish locale it would be "fre, juli 23 2021")
//                 o 7/23/21
//                 o 2021-07-23
//                 o 23 July 2021 (or with a Swedish locale it would be "23 juli 2021")

    public static void main(String[] args) {

        System.out.println(LocalDate.now().getMonth());
        System.out.println(LocalDate.now().getDayOfMonth());

        LocalDateTime futureDate = LocalDateTime.now().plusMonths(6).plusDays(2).plus(7, ChronoUnit.HOURS);

        System.out.println(futureDate.format(DateTimeFormatter.ofPattern("\nE, MMM dd yyyy")));

        System.out.println(futureDate.format(DateTimeFormatter.ofPattern("M/yy/dd")));

        System.out.println(futureDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));

        System.out.println(futureDate.format(DateTimeFormatter.ofPattern("dd MMM yyyy")));

    }
}
