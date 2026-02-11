import java.util.Scanner;

public class ShortestLongestWord {

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
        int words = 1;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ')
                words++;
        }

        String[] result = new String[words];
        int index = 0;
        String word = "";

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                result[index++] = word;
                word = "";
            } else {
                word += text.charAt(i);
            }
        }
        result[index] = word;
        return result;
    }

    static String[][] create2DArray(String[] words) {
        String[][] table = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(findLength(words[i]));
        }
        return table;
    }

    static int[] findShortestLongest(String[][] table) {
        int shortest = Integer.parseInt(table[0][1]);
        int longest = Integer.parseInt(table[0][1]);
        int shortIndex = 0, longIndex = 0;

        for (int i = 1; i < table.length; i++) {
            int len = Integer.parseInt(table[i][1]);

            if (len < shortest) {
                shortest = len;
                shortIndex = i;
            }
            if (len > longest) {
                longest = len;
                longIndex = i;
            }
        }
        return new int[]{shortIndex, longIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitText(text);
        String[][] table = create2DArray(words);
        int[] result = findShortestLongest(table);

        System.out.println("Shortest word: " + table[result[0]][0]);
        System.out.println("Longest word: " + table[result[1]][0]);
    }
}