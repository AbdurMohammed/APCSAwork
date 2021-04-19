//Abdur Mohammed
//Period 5

public class TwoDimensionalArrayFlatten {

    public static void main(String[] args) {

        int[][] TwoDimensional = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int rows = TwoDimensional.length;
        int columns = TwoDimensional[0].length;
        int elements = rows * columns;

        int[] OneDimensional = new int[elements];

        int n = 0;

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                OneDimensional[n] = TwoDimensional[i][j];
                n++;
            }
        }

        System.out.println("Here is your flattened array: ");

        for(int x = 0; x < OneDimensional.length; x++){
            System.out.println(OneDimensional[x]);
        }
    }
}

/*
C:\Users\A.R.M\.jdks\adopt-openjdk-14.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\lib\idea_rt.jar=50834:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath "N:\AP CSA\out\production\AP CSA" TwoDimensionalArrayFlatten
Here is your flattened array:
1
2
3
4
5
6
7
8
9

Process finished with exit code 0

 */
