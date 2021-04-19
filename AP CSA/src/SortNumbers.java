//Abdur Mohammed
//Period 5

import java.util.Scanner;

public class SortNumbers{
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Enter three numbers:");

        double num1 = kb.nextDouble();
        double num2 = kb.nextDouble();
        double num3 = kb.nextDouble();

        System.out.println("Your numbers are: " + num1 + ", " + num2 + ", " + num3);

        double high, med, low;

        if(num1 > num2) {
            if (num1 > num3) {
                high = num1;

                if (num2 > num3) {
                    med = num2;
                    low = num3;
                } else {
                    med = num3;
                    low = num2;
                }
            } else {
                med = num1;
                if (num2 > num3) {
                    high = num2;
                    low = num3;
                } else {
                    high = num3;
                    low = num2;
                }
            }
        }else {
            if (num2 > num3) {
                high = num2;
                if (num1 > num3) {
                    med = num1;
                    low = num3;
                } else {
                    med = num3;
                    low = num1;
                }
            } else {
                med = num2;
                high = num3;
                low = num1;
            }
        }

        System.out.println("Your sorted numbers are: " + low + " " + med + " " + high);

        }

    }

/*
C:\Users\A.R.M\.jdks\adopt-openjdk-14.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\lib\idea_rt.jar=57518:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath "N:\AP CSA\out\production\AP CSA" SortNumbers
Enter three numbers:
4
9
2.5
Your numbers are: 4.0, 9.0, 2.5
Your sorted numbers are: 2.5 4.0 9.0

Process finished with exit code 0

 */