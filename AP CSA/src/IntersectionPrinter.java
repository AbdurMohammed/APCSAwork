//Abdur Mohammed
//Period 5
import java.awt.Rectangle;

public class IntersectionPrinter {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 10, 20, 30);
        Rectangle r2 = new Rectangle(10,15, 10, 10);

        Rectangle r3 = r1.intersection(r2);

        System.out.println("Rectangle 1: " + r1);
        System.out.println("Rectangle 2: " + r2);
        System.out.println("Rectangle 3: " + r3);

    }
}

/* You know the resulting rectangle is empty when the width and height of the resultant rectangle is negative*/

/*
C:\Users\A.R.M\.jdks\adopt-openjdk-14.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\lib\idea_rt.jar=50908:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath "N:\AP CSA\out\production\AP CSA" IntersectionPrinter
Rectangle 1: java.awt.Rectangle[x=5,y=10,width=20,height=30]
Rectangle 2: java.awt.Rectangle[x=10,y=15,width=10,height=10]
Rectangle 3: java.awt.Rectangle[x=10,y=15,width=10,height=10]

Process finished with exit code 0
 */