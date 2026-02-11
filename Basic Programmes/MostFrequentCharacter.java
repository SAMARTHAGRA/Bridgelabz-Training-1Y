import java.util.Scanner;

public class MostFrequentCharacter {

    public static char findMostFrequent(String str) {
        int[] freq = new int[256];   
        int max = 0;
        char mostFrequent = ' ';

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
            
            if (freq[ch] > max) {
                max = freq[ch];
                mostFrequent = ch;
            }
        }

        return mostFrequent;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String input = sc.nextLine();

        char result = findMostFrequent(input);

        System.out.println("Most Frequent Character: '" + result + "'");
    }
}