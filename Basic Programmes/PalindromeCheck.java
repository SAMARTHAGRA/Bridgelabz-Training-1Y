import java.util.Scanner;

public class PalindromeCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.println("Logic 1 (Iterative): " +
                isPalindromeIterative(text));

        System.out.println("Logic 2 (Recursive): " +
                isPalindromeRecursive(text, 0, text.length() - 1));

        System.out.println("Logic 3 (Character Array): " +
                isPalindromeArray(text));

        sc.close();
    }

}