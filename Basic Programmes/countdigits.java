import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Get integer input
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int count = 0;   // b. initialize count to 0
        int temp = number;

        // Special case when number is 0
        if (temp == 0) {
            count = 1;
        } else {
            // c. Loop until number is not equal to 0
            while (temp != 0) {
                // d. Remove last digit
                temp = temp / 10;
                // e. Increase count
                count++;
            }
        }

        // f. Display the count
        System.out.println("Number of digits in " + number + " is " + count);

        sc.close();
    }
}