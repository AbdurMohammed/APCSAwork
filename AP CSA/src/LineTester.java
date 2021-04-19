//Abdur Mohammed
//Period 5

public class LineTester{
  public static void main(String [] args){
    
    Line one = new Line(1,1,-2);//y = -2x + 3
    Line two = new Line(0,0,4,4);// y = 1x
    Line three = new Line(-2,-2); // -2x - 2
    Line four = new Line (-3); // x = -3
    Line five = new Line (-2,3); //y = -2x + 3
    
    System.out.println("Line 1: "+one);
    System.out.println("Line 2: "+two);
    System.out.println("Line 3: "+three);
    System.out.println("Line 4: "+four);
    System.out.println("Line 5: "+five);
    
    //Parallel
    if (one.isParallel(three))
      System.out.println("Line 1 is parallel to line 3");
       
    //Not Parallel
    if (!one.isParallel(two))
      System.out.println("Line 1 is NOT parallel to line 2");
    
    //Intersection
    if (one.intersects(two))
      System.out.println("Line 1 intersects line 2");
        
    //Not Intersection
    if (!one.intersects(five))
      System.out.println("Line 1 does not intersect line 5");
    
    if (one.equals(five))
      System.out.println("Line 1 is equal to Line 5");
    
    if (!one.equals(three))
      System.out.println("Line 1 is NOT equal to Line 3");
  }
}
    
/*
C:\Users\A.R.M\.jdks\adopt-openjdk-14.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\lib\idea_rt.jar=57448:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath "N:\AP CSA\out\production\AP CSA" LineTester
Line 1: y = -2.0x + 3.0
Line 2: y = 1.0x + 0.0
Line 3: y = -2.0x + -2.0
Line 4: x = -3.0
Line 5: y = -2.0x + 3.0
Line 1 is parallel to line 3
Line 1 is NOT parallel to line 2
Line 1 intersects line 2
Line 1 does not intersect line 5
Line 1 is equal to Line 5
Line 1 is NOT equal to Line 3

Process finished with exit code 0

 */