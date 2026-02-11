import java.util.Scanner;

public class SplitTextCompare {

    static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    static String[] splitText(String text) {
        int len = findLength(text);
        int wordCount = 1;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ')
                wordCount++;
        }

        int[] spaceIndex = new int[wordCount + 1];
        int idx = 1;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndex[idx++] = i;
            }
        }
        spaceIndex[wordCount] = len;

        String[] words = new String[wordCount];
        int start = 0;

        for (int i = 0; i < wordCount; i++) {
            String word = "";
            for (int j = start; j < spaceIndex[i + 1]; j++) {
                if (text.charAt(j) != ' ')
                    word += text.charAt(j);
            }
            words[i] = word;
            start = spaceIndex[i + 1] + 1;
        }
        return words;
    }

    static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i]))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] userSplit = splitText(text);
        String[] builtInSplit = text.split(" ");

        System.out.println("Results same? " + compareArrays(userSplit, builtInSplit));
    }
}