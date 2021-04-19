//Abdur Mohammed
//Period 5


import java.util.Scanner;

public class PrimeGenerator {
    public static void main(String[] args) {

        int target;

        Scanner kb = new Scanner(System.in);

        System.out.println("Enter a target integer to find all of the prime numbers leading up to it: ");
        target = kb.nextInt();


            System.out.println("The prime numbers leading up to " + target + " are: ");

            for (int i = 2; i <= target; i++){
                if(isPrime(i)){
                    System.out.println(i);
                }
            }
    }


    public static boolean isPrime(int x){

        if (x % 2 == 0){
            return (x == 2);
        }

        for (int i = 2; i < x; i++){
            if (x % i == 0){
                return false;
            }
        }
        return true;
    }
}

/*
C:\Users\A.R.M\.jdks\adopt-openjdk-14.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\lib\idea_rt.jar=61940:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath "N:\AP CSA\out\production\AP CSA" PrimeGenerator
Enter a target integer to find all of the prime numbers leading up to it:
20
The prime numbers leading up to 20 are:
2
3
5
7
11
13
17
19

Process finished with exit code 0

 */