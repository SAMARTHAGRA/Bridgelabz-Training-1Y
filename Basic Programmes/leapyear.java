import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Check for Gregorian calendar
        if (year < 1582) {
            System.out.println("Year must be 1582 or later (Gregorian calendar).");
        } else {

            // Part 1: Using multiple if-else statements
            if (year % 400 == 0) {
                System.out.println("Using if-else: " + year + " is a Leap Year");
            } else if (year % 100 == 0) {
                System.out.println("Using if-else: " + year + " is not a Leap Year");
            } else if (year % 4 == 0) {
                System.out.println("Using if-else: " + year + " is a Leap Year");
            } else {
                System.out.println("Using if-else: " + year + " is not a Leap Year");
            }

            // Part 2: Using single if statement with logical operators
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("Using logical operators: " + year + " is a Leap Year");
            } else {
                System.out.println("Using logical operators: " + year + " is not a Leap Year");
            }
        }

        sc.close();
    }
}