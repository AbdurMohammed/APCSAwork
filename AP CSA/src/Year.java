//Abdur Mohammed
//Period 5


import java.util.Scanner;


public class Year {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Enter a year to check if it is a leap year:");
        int year = kb.nextInt();

        while(year < 0){
            System.out.println("That year was invalid. Please input another year:");
            year = kb.nextInt();
        }

        System.out.print("Your inputted year of " + year);
        if(isLeapYear(year)){
            System.out.print(" IS a leap year.");
        }
        else{
            System.out.print(" is NOT a leap year");
        }

    }

    public static boolean isLeapYear(int year){
        if ((year % 100) == 0){
            return (year % 400) == 0;
        }
        else return (year % 4) == 0;
    }

}
/*
C:\Users\A.R.M\.jdks\adopt-openjdk-14.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\lib\idea_rt.jar=56314:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath "N:\AP CSA\out\production\AP CSA" Year
Enter a year to check if it is a leap year:
1800
Your inputted year of 1800 is NOT a leap year
Process finished with exit code 0
=======================================================
C:\Users\A.R.M\.jdks\adopt-openjdk-14.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\lib\idea_rt.jar=56321:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath "N:\AP CSA\out\production\AP CSA" Year
Enter a year to check if it is a leap year:
1900
Your inputted year of 1900 is NOT a leap year
Process finished with exit code 0
=======================================================
C:\Users\A.R.M\.jdks\adopt-openjdk-14.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\lib\idea_rt.jar=56326:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath "N:\AP CSA\out\production\AP CSA" Year
Enter a year to check if it is a leap year:
1994
Your inputted year of 1994 is NOT a leap year
Process finished with exit code 0
=======================================================
C:\Users\A.R.M\.jdks\adopt-openjdk-14.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\lib\idea_rt.jar=56335:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath "N:\AP CSA\out\production\AP CSA" Year
Enter a year to check if it is a leap year:
1998
Your inputted year of 1998 is NOT a leap year
Process finished with exit code 0
=======================================================
C:\Users\A.R.M\.jdks\adopt-openjdk-14.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\lib\idea_rt.jar=56356:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath "N:\AP CSA\out\production\AP CSA" Year
Enter a year to check if it is a leap year:
1999
Your inputted year of 1999 is NOT a leap year
Process finished with exit code 0
=======================================================
C:\Users\A.R.M\.jdks\adopt-openjdk-14.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\lib\idea_rt.jar=56365:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath "N:\AP CSA\out\production\AP CSA" Year
Enter a year to check if it is a leap year:
2000
Your inputted year of 2000 IS a leap year.
Process finished with exit code 0
=======================================================
C:\Users\A.R.M\.jdks\adopt-openjdk-14.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\lib\idea_rt.jar=56372:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath "N:\AP CSA\out\production\AP CSA" Year
Enter a year to check if it is a leap year:
2001
Your inputted year of 2001 is NOT a leap year
Process finished with exit code 0
=======================================================
C:\Users\A.R.M\.jdks\adopt-openjdk-14.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\lib\idea_rt.jar=56381:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath "N:\AP CSA\out\production\AP CSA" Year
Enter a year to check if it is a leap year:
2004
Your inputted year of 2004 IS a leap year.
Process finished with exit code 0
=======================================================
C:\Users\A.R.M\.jdks\adopt-openjdk-14.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\lib\idea_rt.jar=56386:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath "N:\AP CSA\out\production\AP CSA" Year
Enter a year to check if it is a leap year:
2100
Your inputted year of 2100 is NOT a leap year
Process finished with exit code 0
=======================================================
C:\Users\A.R.M\.jdks\adopt-openjdk-14.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\lib\idea_rt.jar=56392:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath "N:\AP CSA\out\production\AP CSA" Year
Enter a year to check if it is a leap year:
4
Your inputted year of 4 is NOT a leap year.
Process finished with exit code 0
 */


