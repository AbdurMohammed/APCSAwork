public class HeronTester{
  public static void main(String [] args){
   
    final double EPSILON = 0.00001; 

    double a = 144;
    
    RootApproximator approx = new RootApproximator(a,EPSILON);
    while (approx.hasMoreGuesses())
      System.out.println(approx.nextGuess());
  }
}

/*
C:\Users\A.R.M\.jdks\adopt-openjdk-14.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\lib\idea_rt.jar=59016:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath "N:\AP CSA\out\production\AP CSA" HeronTester
37.0
20.445945945945947
13.744453475286258
12.110703489698958
12.000505968238837
12.000000010666378
12.0

Process finished with exit code 0

 */