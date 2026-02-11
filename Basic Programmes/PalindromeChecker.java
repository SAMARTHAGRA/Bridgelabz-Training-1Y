import java.util.Scanner;

public class PalindromeChecker {

    static String getInput(Scanner sc) {
        return sc.nextLine();
    }

    static boolean isPalindrome(String str) {
        str = str.toLowerCase().replace(" ", "");
        int start = 0, end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    static void displayResult(boolean result) {
        if (result)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String input = getInput(sc);

        displayResult(isPalindrome(input));
    }
}