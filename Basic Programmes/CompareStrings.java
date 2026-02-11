import java.util.Scanner;

public class CompareStrings {

    public static int compareStrings(String s1, String s2) {
        int minLength = Math.min(s1.length(), s2.length());

        for (int i = 0; i < minLength; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return s1.charAt(i) - s2.charAt(i);
            }
        }

        return s1.length() - s2.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First String: ");
        String str1 = sc.nextLine();

        System.out.print("Enter Second String: ");
        String str2 = sc.nextLine();

        int result = compareStrings(str1, str2);

        if (result < 0)
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order");
        else if (result > 0)
            System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order");
        else
            System.out.println("Both strings are equal");
    }
}