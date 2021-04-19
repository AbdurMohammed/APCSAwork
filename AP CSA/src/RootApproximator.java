//Abdur Mohammed
//Period 5

public class RootApproximator {

    double a, epsilon;
    double guess = 1;
    double nextGuess = 2;

    public RootApproximator(double a, double epsilon){
        this.a = a;
        this.epsilon = epsilon;
    }


    public double nextGuess(){
        double point1 = a / guess;
        double point2 = guess;

        nextGuess = (point1 + point2) / 2;

        return nextGuess;
    }

    public boolean hasMoreGuesses(){

        if(java.lang.Math.abs((guess - nextGuess)) < epsilon){
            return false;
        }
        else{
            guess = nextGuess;
            return true;
        }

        // (!(java.lang.Math.abs((guess - nextGuess)) < epsilon));

    }


}
