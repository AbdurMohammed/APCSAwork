import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lab1OE {
    public static void main(String[] args) {

        System.out.println("Enter your grades, enter -1 to stop.");

        Scanner kb = new Scanner(System.in);
        double grade;
        ArrayList<Double> grades = new ArrayList<Double>();

        do {
            grade = kb.nextDouble();

            if (grade == -1) {
                break;
            }

            grades.add(grade);

        } while (grade != -1);

        double avg = findAvg(grades);
        System.out.println("Your average is: " + avg);

        String letterGrade = toLetterGrade(avg);
        System.out.println("Your letter grade is: " + letterGrade);

        String feedback = feedback(grades);
        System.out.println(feedback);


    }

    public static double findAvg(ArrayList grades) {
        double sum = 0;
        double avg;
        for (int i = 0; i < grades.size(); i++) {
            sum += (double) grades.get(i);
        }
        avg = sum / grades.size();
        return avg;
    }

    public static String toLetterGrade(double grade) {

        String letterGrade = null;

        if (grade < 60) {
            letterGrade = "F";
        } else if (60 <= grade && grade <= 70) {
            letterGrade = "D";
        } else if (70 < grade && grade <= 80) {
            letterGrade = "C";
        } else if (80 < grade && grade <= 90) {
            letterGrade = "B";
        } else if (90 < grade && grade <= 100) {
            letterGrade = "A";
        }

        return letterGrade;


    }

    public static String feedback(ArrayList grades){

        double minGrade = (double) grades.get(0);

        for (int i = 0; i < grades.size(); i++){
            if((double) grades.get(i) < minGrade){
                minGrade = (double) grades.get(i);
            }

        }

        return "Your lowest grade was a " + minGrade + ", maybe you should review that one.";

    }
}