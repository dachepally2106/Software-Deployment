import java.util.Scanner;

public class LetterGrade {
    public static void main(String[] args) {
        String LetterGrade;
        System.out.println(" Sathish Dachepally");
        System.out.println("Please enter your grade :");
        Scanner scan = new Scanner(System.in);
        int grade = scan.nextInt();

        if (grade >= 90) {
            if (grade >= 95) {
                LetterGrade = "A+";
            } else {
                LetterGrade = "A";
            }
        } else if (grade >= 80) {
            if (grade >= 85) {
                LetterGrade = "B+";
            } else {
                LetterGrade = "B";
            }
        } else if (grade >= 70) {
            if (grade >= 75) {
                LetterGrade = "C+";
            } else {
                LetterGrade = "C";
            }
        } else if (grade >= 60) {
            if (grade >= 65) {
                LetterGrade = "D+";
            } else {
                LetterGrade = "D";
            }
        } else {
            LetterGrade = "F";
        }

        System.out.println("Your letter grade is: " + LetterGrade);
    }
}

