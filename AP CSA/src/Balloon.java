//Abdur Mohammed
//Period 5


public class Balloon {

    double volume;

    public Balloon() {
        volume = 0;
    }

    void addAir(double amount){
        volume += amount;
    }

    double getVolume(){
        return volume;
    }

    double getSurfaceArea(){
        return volume * 3 / this.getRadius();
    }

    double getRadius(){
        return Math.pow(volume / ((4 * Math.PI) / 3), 1.0/3);
    }
}

/*
C:\Users\A.R.M\.jdks\adopt-openjdk-14.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\lib\idea_rt.jar=49763:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath "N:\AP CSA\out\production\AP CSA" BalloonTester
Initial:
Balloon Volume: 0.0
Balloon Surface Area: 0.0
Balloon Radius: 1.0
After adding initial first 100 cm^3:
Balloon Volume: 100.0
Balloon Surface Area: 300.0
Balloon Radius: 1.0
After adding another 100 cm^3:
Balloon Volume: 200.0
Balloon Surface Area: 600.0
Balloon Radius: 1.0

Process finished with exit code 0
 */