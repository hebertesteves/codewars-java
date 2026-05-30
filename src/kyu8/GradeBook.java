package kyu8;

public class GradeBook {
    public static char getGrade(int s1, int s2, int s3) {
        int media = (s1 + s2 + s3) / 3;
        char grade;
        if (media < 60) {
            grade = 'F';
        } else if (media < 70) {
            grade = 'D';
        } else if (media < 80) {
            grade = 'C';
        } else if (media < 90) {
            grade = 'B';
        } else {
            grade = 'A';
        }
        return grade;
    }
}
