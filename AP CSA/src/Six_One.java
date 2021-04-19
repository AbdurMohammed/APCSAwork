//Abdur Mohammed
//Period 5

public class Six_One {

    public static void main(String[] args) {
        int[] numbers = {14, 1, 22, 17, 36, 7, -43, 5};
        int min = 4, max = 17;

        int numValues = countInRange(numbers, min, max);

        System.out.println("There are " + numValues + " elements that fall within the values of " + min + " and " + max);
    }

    public static int countInRange(int[] array, int min, int max){
        int count = 0;
        for(int i : array){
            if(i >= min && i <= max)
                count++;
        }
        return count;
    }
}

/*
C:\Users\A.R.M\.jdks\adopt-openjdk-14.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\lib\idea_rt.jar=50713:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath "N:\AP CSA\out\production\AP CSA" Six_One
There are 4 elements that fall within the values of 4 and 17

Process finished with exit code 0

 */