import java.util.Scanner;

public class ReplaceWord {

    public static String replaceWord(String sentence, String oldWord, String newWord) {
        String[] words = sentence.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(oldWord)) {
                result += newWord;
            } else {
                result += words[i];
            }

            if (i != words.length - 1)
                result += " ";
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Enter Word to Replace: ");
        String oldWord = sc.next();

        System.out.print("Enter New Word: ");
        String newWord = sc.next();

        System.out.println("Modified Sentence: " + replaceWord(sentence, oldWord, newWord));
    }
}