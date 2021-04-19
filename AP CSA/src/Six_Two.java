//Abdur Mohammed
//Period 5

public class Six_Two {
    public static void main(String[] args) {

    int[] array = new int[100];

        System.out.println("The 100 random numbers are as shown: ");

    for (int x = 0; x < array.length; x++){
        int randGen = (int) (Math.floor(Math.random() * 100) + 1);
        System.out.print(randGen + ", ");

        array[x] = randGen;
    }
        System.out.println();

    int rangeEnd = 0;

    for (int i = 0; i < 100; i += 10){

        rangeEnd += 10;
        System.out.print((i+1) + " - " + rangeEnd + ": ");


        for (int x = 0; x < array.length; x ++){

            int currentNum = array[x];

            if(currentNum >= i && currentNum <= rangeEnd){
                System.out.print("*");
                array[x]--;
            }

        }

        System.out.println();

    }

    }
}

/*
C:\Users\A.R.M\.jdks\adopt-openjdk-14.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\lib\idea_rt.jar=55753:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath "N:\AP CSA\out\production\AP CSA" Six_Two
The 100 random numbers are as shown:
37, 81, 2, 80, 74, 86, 66, 48, 50, 73, 48, 64, 56, 11, 81, 74, 5, 8, 60, 63, 87, 6, 59, 62, 95, 97, 37, 8, 68, 41, 33, 9, 23, 87, 87, 5, 6, 77, 9, 84, 22, 47, 92, 99, 75, 21, 21, 92, 75, 45, 51, 15, 76, 76, 51, 17, 69, 2, 73, 49, 71, 73, 1, 26, 29, 59, 40, 81, 28, 48, 63, 22, 43, 96, 95, 22, 10, 88, 30, 60, 63, 97, 93, 18, 8, 88, 22, 84, 27, 30, 36, 77, 66, 70, 52, 44, 64, 12, 90, 1,
1 - 10: **************
11 - 20: *****
21 - 30: *************
31 - 40: *****
41 - 50: **********
51 - 60: ********
61 - 70: ***********
71 - 80: *************
81 - 90: ************
91 - 100: *********

Process finished with exit code 0
 */