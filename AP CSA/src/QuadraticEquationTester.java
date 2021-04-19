import java.util.Scanner;

public class QuadraticEquationTester {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Type in the a coefficient:");
        double a = kb.nextDouble();

        System.out.println("Type in the b coefficient:");
        double b = kb.nextDouble();

        System.out.println("Type in the c coefficient:");
        double c = kb.nextDouble();

        System.out.println("Your equation is: " + a + "x^2 + " + b + "x + " + c);

        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        double solution1 = equation.getSolution1();
        double solution2 = equation.getSolution2();

        if (solution1 == 0){
            System.out.println("This quadratic equation has no real solutions");
        }
        else if(solution1 > solution2){
            System.out.println("The first solution is " + solution2);
            System.out.println("The second solution is " + solution1);
        }
        else{
            System.out.println("The first solution is " + solution1);
            System.out.println("The second solution is " + solution2);
        }

    }
}

/* Trial1 - 2 real solutions:

C:\Users\A.R.M\.jdks\adopt-openjdk-14.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\lib\idea_rt.jar=56923:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath "N:\AP CSA\out\production\AP CSA" QuadraticEquationTester
Type in the a coefficient:
-8
Type in the b coefficient:
4
Type in the c coefficient:
16
Your equation is: -8.0x^2 + 4.0x + 16.0
The first solution is -1.1861406616345072
The second solution is 1.6861406616345072

Process finished with exit code 0

 */

/* Trial2 - no real solutions:
C:\Users\A.R.M\.jdks\adopt-openjdk-14.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\lib\idea_rt.jar=56938:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath "N:\AP CSA\out\production\AP CSA" QuadraticEquationTester
        Type in the a coefficient:
        1
        Type in the b coefficient:
        1
        Type in the c coefficient:
        3
        Your equation is: 1.0x^2 + 1.0x + 3.0
        This quadratic equation has no real solutions

        Process finished with exit code 0

*/