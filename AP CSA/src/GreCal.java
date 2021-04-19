//Abdur Mohammed
//Period 5

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GreCal {
    public static void main(String[] args) {

        GregorianCalendar cal = new GregorianCalendar();

        cal.add(GregorianCalendar.DATE, 100);
        System.out.println("The date 100 days from today is: " + cal.getTime());

        GregorianCalendar abdurBirthday = new GregorianCalendar(2003, Calendar.FEBRUARY, 27);
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        String dayOfBday = weekdays[abdurBirthday.get(GregorianCalendar.DAY_OF_WEEK)-1];
        System.out.println("The weekday of my birthday is a " + dayOfBday);

        abdurBirthday.add(GregorianCalendar.DATE, 10000);
        System.out.println("The date 10,000 days from my birthday is " + abdurBirthday.getTime());
    }

}

/*
C:\Users\A.R.M\.jdks\adopt-openjdk-14.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\lib\idea_rt.jar=50596:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath "N:\AP CSA\out\production\AP CSA" GreCal
The date 100 days from today is: Fri Jan 22 07:44:19 EST 2021
The weekday of my birthday is a Thursday
The date 10,000 days from my birthday is Mon Jul 15 00:00:00 EDT 2030

Process finished with exit code 0

 */