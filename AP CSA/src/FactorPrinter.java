//Abdur Mohammed
//Period 5

import java.util.Scanner;

public class FactorPrinter {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a number you would like to find the prime factors for: ");
        int num = kb.nextInt();

        FactorGenerator factGen = new FactorGenerator(num);

        System.out.println("The prime factors are: ");

        while(factGen.hasMoreFactors() == true){
            System.out.println(factGen.nextFactor());
        }

    }
}
/*C:\Users\A.R.M\.jdks\adopt-openjdk-14.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\lib\idea_rt.jar=59665:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath "N:\AP CSA\out\production\AP CSA" FactorPrinter
Enter a number you would like to find the prime factors for: 150
The prime factors are:
2
3
5
5

Process finished with exit code 0
----------------------------------------------------------------------------------------------------------------------------------------------------------------
C:\Users\A.R.M\.jdks\adopt-openjdk-14.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\lib\idea_rt.jar=59670:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath "N:\AP CSA\out\production\AP CSA" FactorPrinter
Enter a number you would like to find the prime factors for: 27
The prime factors are:
3
3
3

Process finished with exit code 0
 */