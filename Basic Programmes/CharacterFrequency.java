import java.util.Scanner;

public class CharacterFrequency {

    static String[][] findFrequency(String text) {
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] != 0)
                count++;
        }

        String[][] result = new String[count][2];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[ch] != 0) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq[ch]);
                index++;
                freq[ch] = 0; // avoid duplicates
            }
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