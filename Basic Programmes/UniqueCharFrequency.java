import java.util.Scanner;

public class UniqueCharFrequency {

    static char[] uniqueCharacters(String text) {
        String unique = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean found = false;

            for (int j = 0; j < unique.length(); j++) {
                if (unique.charAt(j) == ch) {
                    found = true;
                    break;
                }
            }
            if (!found)
                unique += ch;
        }

        char[] result = new char[unique.length()];
        for (int i = 0; i < unique.length(); i++) {
            result[i] = unique.charAt(i);
        }
        return result;
    }

    static String[][] findFrequency(String text) {
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        char[] uniqueChars = uniqueCharacters(text);
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(freq[uniqueChars[i]]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] freqTable = findFrequency(text);

        System.out.println("\nCharacter\tFrequency");
        for (int i = 0; i < freqTable.length; i++) {
            System.out.println(freqTable[i][0] + "\t\t" + freqTable[i][1]);
        }
    }
}