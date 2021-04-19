//Abdur Mohammed
//Period 5

public class NumbersTester {
    public static void main(String[] args) {

        //Testing mean method

        double[] meanArray = {12, 28, 34, 3, 8};
        double mean = Numbers.mean(meanArray);

        System.out.println("The inputted numbers are: 12, 28, 34, 3, 8");
        System.out.println("Expected mean: 17");
        System.out.println("Calculated mean: " + mean);

        System.out.println();

        //Testing mode method

        int[] modeArray = {27, 15, 15, 11, 27};
        int mode = Numbers.mode(modeArray);

        System.out.println("The inputted numbers are: 27, 15, 15, 11, 27");
        System.out.println("Expected mode: 15");
        System.out.println("Calculated mode: " + mode);

        System.out.println();

        //Testing standard deviation method

        int[] stDevArray = {1, -2, 4, -4, 9, -6, 16, -8, 25, -10};
        double stDev = Numbers.stDev(stDevArray);

        System.out.println("The inputted numbers are: 1, -2, 4, -4, 9, -6, 16, -8, 25, -10");
        System.out.println("Expected standard deviation: 11.237");
        System.out.println("Calculated standard deviation: " + stDev);

        System.out.println();

        //Testing median method

        int[] oddMedianArray = {5, 88, 7, 32, 61};
        double median = Numbers.median(oddMedianArray);

        System.out.println("Inputted array: 5, 88, 7, 32, 61");
        System.out.println("Expected median: 32");
        System.out.println("Calculated median: " + median);

        int[] evenMedianArray = {8, 32, 18, 97, 43, 66};
        median = Numbers.median(evenMedianArray);

        System.out.println("Inputted array: 8, 32, 18, 97, 43, 66");
        System.out.println("Expected median: 37.5");
        System.out.println("Calculated median: " + median);

        System.out.println();

        //Test kthLargest method

        int[] kthLargestArray = {74, 85, 102, 99, 101, 56, 84};
        int k = 2;

        int element = Numbers.kthLargest(k, kthLargestArray);

        System.out.println("Inputted array: 74, 85, 102, 99, 101, 56, 84");
        System.out.println("Expected element value: 99");
        System.out.println("Calculated element value: 99");

    }
}

/*
C:\Users\A.R.M\.jdks\adopt-openjdk-14.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\lib\idea_rt.jar=52368:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath "N:\AP CSA\out\production\AP CSA" NumbersTester
The inputted numbers are: 12, 28, 34, 3, 8
Expected mean: 17
Calculated mean: 17.0

The inputted numbers are: 27, 15, 15, 11, 27
Expected mode: 15
Calculated mode: 15

The inputted numbers are: 1, -2, 4, -4, 9, -6, 16, -8, 25, -10
Expected standard deviation: 11.237
Calculated standard deviation: 11.23733855402505

Inputted array: 5, 88, 7, 32, 61
Expected median: 32
Calculated median: 32.0
Inputted array: 8, 32, 18, 97, 43, 66
Expected median: 37.5
Calculated median: 37.5

Inputted array: 74, 85, 102, 99, 101, 56, 84
Expected element value: 99
Calculated element value: 99

Process finished with exit code 0
 */