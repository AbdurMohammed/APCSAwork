//Abdur Mohammed
//Period 5

public class StudentTester {
    public static void main(String[] args) {
        Student studentOne = new Student("Abdur Mohammed", 473, 5);

        String studentName = studentOne.getName();
        System.out.println("The student's name is " + studentName);
        System.out.println("Expected: The student's name is Abdur Mohammed");

        studentOne.addQuiz(88);

        int totalScore = studentOne.getTotalScore();
        System.out.println("The student's total quiz score is " + totalScore + " points");
        System.out.println("Expected: The student's total quiz score is 561 points");

        double averageScore = studentOne.getAverageScore();
        System.out.println("The student's average quiz score is " + averageScore + " points");
        System.out.println("Expected: The student's average quiz score is 93.5 points");

    }
}

/*
C:\Users\A.R.M\.jdks\adopt-openjdk-14.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\lib\idea_rt.jar=56946:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath "N:\AP CSA\out\production\AP CSA" StudentTester
The student's name is Abdur Mohammed
Expected: The student's name is Abdur Mohammed
The student's total quiz score is 561 points
Expected: The student's total quiz score is 561 points
The student's average quiz score is 93.0 points
Expected: The student's average quiz score is 93.5 points

Process finished with exit code 0


 */