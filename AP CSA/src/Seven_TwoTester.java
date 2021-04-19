//Abdur Mohammed
//Period 5

public class Seven_TwoTester {
    public static void main(String[] args) {

        //Start of a workday at the hospital
        Surgeon surgeon = new Surgeon();
        Nurse nurse = new Nurse();
        Receptionist receptionist = new Receptionist();

        //Everyone clocks in
        surgeon.clockIn();
        nurse.clockIn();
        receptionist.clockIn();

        //Everyone works
       surgeon.operate();
       nurse.administerMedicine();
       receptionist.answerCalls();

       nurse.clockOut();
       receptionist.clockOut();

       if(surgeon.isOvertime()){
           System.out.println("The surgeon is working overtime today");
       }

    }
}
