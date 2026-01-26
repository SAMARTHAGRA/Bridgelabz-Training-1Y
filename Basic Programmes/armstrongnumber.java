import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // b. Get input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;                     // initialize sum to zero
        int originalNumber = number;     // store original number

        // c. Use while loop till originalNumber is not zero
        while (originalNumber != 0) {

            // d. Get last digit using modulus
            int digit = originalNumber % 10;

            // find cube of the digit and add to sum
            sum = sum + (digit * digit * digit);

            // e. Remove last digit using division
            originalNumber = originalNumber / 10;
        }

        // f. Compare sum with the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number");
        } else {
            System.out.println(number + " is not an Armstrong Number");
        }

        sc.close();
    }
}