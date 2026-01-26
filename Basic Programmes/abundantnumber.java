import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // b. Get integer input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;   // c. Initialize sum to 0

        // d. Run for loop from 1 to number - 1
        for (int i = 1; i < number; i++) {
            // e. Check if number is divisible by i
            if (number % i == 0) {
                // f. Add divisor to sum
                sum += i;
            }
        }

        // g & h. Check if sum is greater than number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number");
        } else {
            System.out.println(number + " is not an Abundant Number");
        }

        sc.close();
    }
}