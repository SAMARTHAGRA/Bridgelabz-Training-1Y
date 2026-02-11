import java.util.Random;

public class StudentGradeSystem {

    public static int[][] generateScores(int students) {
        Random rand = new Random();
        int[][] scores = new int[students][3]; // P C M

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = rand.nextInt(90) + 10; // 10–99
            }
        }
        return scores;
    }
    public static double[][] calculateResults(int[][] scores) {
        int students = scores.length;
        double[][] result = new double[students][3]; // total, average, percentage

        for (int i = 0; i < students; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // rounding to 2 digits
            result[i][0] = Math.round(total * 100.0) / 100.0;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return result;
    }
    public static char[] calculateGrade(double[][] result) {
        int students = result.length;
        char[] grade = new char[students];

        for (int i = 0; i < students; i++) {
            double p = result[i][2];

            if (p >= 80) grade[i] = 'A';
            else if (p >= 70) grade[i] = 'B';
            else if (p >= 60) grade[i] = 'C';
            else if (p >= 50) grade[i] = 'D';
            else if (p >= 40) grade[i] = 'E';
            else grade[i] = 'R';
        }
        return grade;
    }
    public static void displayScorecard(int[][] scores, double[][] result, char[] grade) {
        System.out.println("ID\tPhysics\tChem\tMath\tTotal\tAverage\t%age\tGrade");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.println(
                (i + 1) + "\t" +
                scores[i][0] + "\t" +
                scores[i][1] + "\t" +
                scores[i][2] + "\t" +
                result[i][0] + "\t" +
                result[i][1] + "\t" +
                result[i][2] + "\t" +
                grade[i]
            );
        }
    }

    public static void main(String[] args) {
        int students = 5;

        int[][] scores = generateScores(students);
        double[][] result = calculateResults(scores);
        char[] grade = calculateGrade(result);

        displayScorecard(scores, result, grade);
    }
}
