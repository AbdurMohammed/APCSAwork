//Abdur Mohammed
//Period 5

public class FibonacciGenerator {

    int n = 0, firstNum = 0, secondNum = 0, nextNum = 0;

    public int nextNumber(){

        while (n <= 1){
            nextNum += n;
            n++;
            return nextNum;
        }

        firstNum = secondNum;
        secondNum = nextNum;
        nextNum = firstNum + secondNum;

        return nextNum;
    }

}

