import java.time.LocalDate;
import java.util.Scanner;

//        Task 1 - Calculate the age of the user
//        Create a program that asks the user to enter the year of birth, and then print out the age of the
//        user.

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LocalDate localDate = LocalDate.now();

        System.out.print("Enter the year you were born: ");
        int yearInput = Integer.valueOf(scanner.nextLine());

        System.out.println(localDate.getYear() - yearInput);


    }
}