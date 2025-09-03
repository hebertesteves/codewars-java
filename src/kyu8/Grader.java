package kyu8;

public class Grader {
    public static char grader(double score){
        char grade;
        if (score > 1.0 || score < 0.6) {
            grade = 'F';
        } else if (score >= 0.9) {
            grade = 'A';
        } else if (score >= 0.8) {
            grade = 'B';
        } else if (score >= 0.7) {
            grade = 'C';
        } else {
            grade = 'D';
        }

        return grade;
    }
}
