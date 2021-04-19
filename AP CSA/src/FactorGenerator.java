//Abdur Mohammed
//Period 5

public class FactorGenerator {

    int num;
    int factor = 2;

    public FactorGenerator(int numToFactor){
       num = numToFactor;
    }

    public int nextFactor(){
        return factor;
    }

    public boolean hasMoreFactors(){

        do {
                if((num % factor) == 0){
                    num /= factor;
                    return true;
                }
                else{
                    factor++;
                }


        } while(factor <= num);
        return false;


    }

}
