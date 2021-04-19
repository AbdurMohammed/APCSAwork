//Abdur Mohammed
//Period 5

import java.util.Scanner;
import java.lang.Math;

public class QuadraticEquation {

    double a, b, c;
    double solution1, solution2;

    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public boolean hasSolutions(){
        double discrm = (Math.pow(b, 2)) - (4 * a * c);

        if (discrm < 0.0){
            return false;
        }
        else{
            return true;
        }
    }

    public double getSolution1() {
        if (hasSolutions()) {
            double solution = (-b + (Math.sqrt((Math.pow(b, 2)) - (4 * a * c)))) / (2 * a);
            return solution;
        } else {
            return 0;
        }
    }

    public double getSolution2(){
        if (hasSolutions()){
            double solution = (-b - (Math.sqrt((Math.pow(b, 2)) - (4 * a * c)))) / (2 * a);
            return solution;
        }
        else{
            return 0;
        }
    }



}
