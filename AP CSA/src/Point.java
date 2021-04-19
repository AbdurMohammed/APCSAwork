//Abdur Mohammed
//Period 5

import java.awt.geom.Point2D;

public class Point {



    public static void main(String[] args) {
       Point2D.Double point1 = new Point2D.Double(25, 25);
       Point2D.Double point2 = new Point2D.Double(50, 50);

       System.out.println("Location of the first point: " + point1);
       System.out.println("Location of the second point: " + point2);

       point1.setLocation(12.5, 12.5);
       point2.setLocation(25, 25);

       if (point1 == point2){
           System.out.println("The locations of the two points are equal after changing");
       }
       else{
           System.out.println("The locations of the two points are not equal after changing");
       }

       System.out.println("Location of the first point after changing: " + point1);
       System.out.println("Location of the second point after changing: " + point2);

    }
}

/* C:\Users\A.R.M\.jdks\adopt-openjdk-14.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\lib\idea_rt.jar=62650:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath "N:\AP CSA\out\production\AP CSA" Point
Location of the first point: Point2D.Double[25.0, 25.0]
Location of the second point: Point2D.Double[50.0, 50.0]
The locations of the two points are not equal after changing
Location of the first point after changing: Point2D.Double[12.5, 12.5]
Location of the second point after changing: Point2D.Double[25.0, 25.0]

Process finished with exit code 0
*/