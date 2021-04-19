//Abdur Mohammed
//Period 5

public class Employee {

    private final boolean employeeAccessCard = true;
    boolean clockedIn = false;
    boolean clockedOut = false;

    public Employee(){
        clockIn();
    }

    public void clockIn(){
        boolean clockedIn = true;
    }

    public void clockOut(){
        boolean clockedOut = true;
    }

    public boolean isOvertime(){
        return(!clockedOut);
    }

}

/*
C:\Users\A.R.M\.jdks\adopt-openjdk-14.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\lib\idea_rt.jar=62546:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath "N:\AP CSA\out\production\AP CSA" Seven_TwoTester
The surgeon is performing an operation on a patient.
The nurse is administering medicine to a patient.
The receptionist is answering calls at the front desk.
The surgeon is working overtime today

Process finished with exit code 0

 */