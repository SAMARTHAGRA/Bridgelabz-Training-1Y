import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // b. Get integer input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;                 // c. initialize sum to 0
        int temp = number;           // store original number

        // d. Use while loop to access each digit
        while (temp != 0) {
            // e. Add each digit to sum
            int digit = temp % 10;
            sum += digit;
            temp = temp / 10;
        }

        // f & g. Check Harshad condition
        if (sum != 0 && number % sum == 0) {
            System.out.println(number + " is a Harshad Number");
        } else {
            System.out.println(number + " is not a Harshad Number");
        }

        sc.close();
    }
}