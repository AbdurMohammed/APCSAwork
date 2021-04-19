//Abdur
//Period 5

public class Car {

    double gasInTank;
    double carMileage;

    public Car(double efficiency){
        carMileage = efficiency;
        gasInTank = 0;
    }

    public void addGas(double gasIntake){
        gasInTank += gasIntake;
    }

    public void drive(double distance){
        gasInTank -= (distance / carMileage);
    }

    public double getGasInTank(){
        return gasInTank;
    }

}
