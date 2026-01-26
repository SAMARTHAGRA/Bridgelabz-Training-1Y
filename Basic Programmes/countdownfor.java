import java.util.Scanner;

public class RocketCountdownFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter countdown start number: ");
        int number = sc.nextInt();

        for (int counter = number; counter >= 1; counter--) {
            System.out.println(counter);
        }

        System.out.println("🚀 Launch!");

        sc.close();
    }
}