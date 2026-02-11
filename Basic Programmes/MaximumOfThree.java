import java.util.Scanner;

public class MaximumOfThree {

    static int getInput(Scanner sc) {
        return sc.nextInt();
    }

    static int findMax(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = getInput(sc);

        System.out.print("Enter second number: ");
        int b = getInput(sc);

        System.out.print("Enter third number: ");
        int c = getInput(sc);

        System.out.println("Maximum: " + findMax(a, b, c));
    }
}