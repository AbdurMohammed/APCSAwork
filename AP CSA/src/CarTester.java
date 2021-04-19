//Abdur
//Period 5

public class CarTester {
    public static void main(String[] args) {
        Car myHybrid = new Car(50); //50 miles per gallon

        myHybrid.addGas(20); //Tank 20 gallons

        myHybrid.drive(100); //Drive 100 miles

        double gasLeft = myHybrid.getGasInTank(); //Get gas remaining in tank

        System.out.println("Gas left in tank: " + gasLeft + " gallons");
        System.out.println("Expected: 18.0 gallons");
    }
}

/*
C:\Users\A.R.M\.jdks\adopt-openjdk-14.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\lib\idea_rt.jar=50602:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath "N:\AP CSA\out\production\AP CSA" CarTester
Gas left in tank: 18.0 gallons
Expected: 18.0 gallons

Process finished with exit code 0
 */