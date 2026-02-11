import java.util.Scanner;

public class NumberGuessingGame {

    static int generateGuess(int low, int high) {
        return (low + high) / 2;   
    }

    static String getFeedback(Scanner sc) {
        System.out.print("Enter feedback (high/low/correct): ");
        return sc.nextLine().toLowerCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int low = 1, high = 100;
        String feedback = "";

        System.out.println("Think of a number between 1 and 100.");

        while (!feedback.equals("correct")) {
            int guess = generateGuess(low, high);
            System.out.println("Computer guesses: " + guess);

            feedback = getFeedback(sc);

            if (feedback.equals("high"))
                high = guess - 1;
            else if (feedback.equals("low"))
                low = guess + 1;
        }

        System.out.println("Yay! Computer guessed correctly.");
    }
}