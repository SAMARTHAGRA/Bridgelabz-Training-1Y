import java.util.Scanner;

public class TrimUsingCharAt {

    static int[] findTrimIndexes(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start <= end && text.charAt(start) == ' ')
            start++;

        while (end >= start && text.charAt(end) == ' ')
            end--;

        return new int[]{start, end + 1};
    }

    static String createSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text with spaces: ");
        String text = sc.nextLine();

        int[] indexes = findTrimIndexes(text);
        String userTrim = createSubstring(text, indexes[0], indexes[1]);
        String builtInTrim = text.trim();

        System.out.println("Trim using charAt(): [" + userTrim + "]");
        System.out.println("Trim using trim(): [" + builtInTrim + "]");
        System.out.println("Results same? " + compareStrings(userTrim, builtInTrim));
    }
}