import java.util.Scanner;
public class FibonacciRunner
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter n:");
    int n = in.nextInt();
    
    FibonacciGenerator fg = new FibonacciGenerator();
    
    for (int i = 1; i <= n; i++)
      System.out.println(fg.nextNumber());
  }
}
/* OUTPUT:
C:\Users\A.R.M\.jdks\adopt-openjdk-14.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\lib\idea_rt.jar=59463:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath "N:\AP CSA\out\production\AP CSA" FibonacciRunner
Enter n:
10
0
1
1
2
3
5
8
13
21
34

Process finished with exit code 0
 */