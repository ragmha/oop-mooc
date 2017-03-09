import java.util.Scanner;

public class GradeDistribution {
    int[] grades;

    public GradeDistribution(Scanner reader) {
        this.grades = new int[6];
    }

    public int grade(int score) {

        if(score < 30){
            return 0;
        }

        if (score < 35) {
            return 1;
        }

        if (score < 40) {
            return 2;
        }

        if (score < 45) {
            return 3;
        }

        if (score < 50) {
            return 4;
        }

        return 5;
    }

    public void addScore(int score) {
        if (score < 0 || score > 60 ) return;

        int theGrade = grade(score);

        this.grades[theGrade]++;
    }

    private static String stars(int n) {
        String stars = "";
        for (int j = 0; j < n; j++) {
            stars += "*";
        }
        return stars;
    }

    private double acceptancePercentage() {
        double allScores = 0;

        for (int i = 0; i < grades.length; i++) {
            allScores += grades[i];
        }

        double failed = grades[0];

        return (allScores - failed) * 100 / allScores;
    }

    public void printGrade() {
        System.out.println("Grade distribution: ");

        for(int i = 5; i >=0; i--) {
            System.out.println(i + ": " + stars(grades[i]));

        }

        System.out.println("Acceptance Percentage " + acceptancePercentage());
    }
}
