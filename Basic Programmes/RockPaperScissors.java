import java.util.Scanner;

public class RockPaperScissors {

    static String getComputerChoice() {
        int choice = (int)(Math.random() * 3);
        if (choice == 0) return "rock";
        if (choice == 1) return "paper";
        return "scissors";
    }

    static String findWinner(String user, String computer) {
        if (user.equals(computer))
            return "Draw";

        if ((user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("paper") && computer.equals("rock")) ||
            (user.equals("scissors") && computer.equals("paper")))
            return "User";

        return "Computer";
    }

    static String[][] calculateStats(int userWins, int compWins, int games) {
        String[][] stats = new String[2][3];

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.valueOf((userWins * 100.0) / games);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(compWins);
        stats[1][2] = String.valueOf((compWins * 100.0) / games);

        return stats;
    }

    static void displayStats(String[][] stats) {
        System.out.println("\nPlayer\tWins\tWin %");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int games = sc.nextInt();

        int userWins = 0, compWins = 0;

        for (int i = 1; i <= games; i++) {
            System.out.print("Game " + i + " - Enter rock/paper/scissors: ");
            String userChoice = sc.next().toLowerCase();

            String compChoice = getComputerChoice();
            String winner = findWinner(userChoice, compChoice);

            System.out.println("Computer chose: " + compChoice);
            System.out.println("Winner: " + winner);

            if (winner.equals("User")) userWins++;
            if (winner.equals("Computer")) compWins++;
        }

        String[][] stats = calculateStats(userWins, compWins, games);
        displayStats(stats);
    }
}