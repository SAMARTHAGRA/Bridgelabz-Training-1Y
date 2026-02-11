import java.util.Scanner;

public class RemoveSpecificCharacter {

    public static String removeCharacter(String str, char chToRemove) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != chToRemove) {
                result += str.charAt(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String input = sc.nextLine();

        System.out.print("Enter Character to Remove: ");
        char ch = sc.next().charAt(0);

        System.out.println("Modified String: " + removeCharacter(input, ch));
    }
}