//Abdur Mohammed
//Period 5

public class CoinTester {
    public static void main(String[] args) {

        MonetaryCoin coin1 = new MonetaryCoin(.01);
        MonetaryCoin coin2 = new MonetaryCoin(.05);
        MonetaryCoin coin3 = new MonetaryCoin(.1);
        MonetaryCoin coin4 = new MonetaryCoin(.25);

        double sumCoins = coin1.findValue() + coin2.findValue() + coin3.findValue() + coin4.findValue();
        System.out.print("The 4 coins are worth $");
        System.out.printf("%.2f\n", sumCoins);


        //Flip Test - even though flip is not written in MonetaryCoin it can still be called on coin1 since it extends the Coin class.
        String face;

        coin1.flip();
        if(coin1.isHeads()){
            face = "Heads";
        }
        else{
            face = "Tails";
        }

        System.out.println("Flipping the coin resulted in " + face);

        //Flip again to check if the flip worked

        coin1.flip();
        if(coin1.isHeads()){
            face = "Heads";
        }
        else{
            face = "Tails";
        }

        System.out.println("Flipping the coin AGAIN resulted in " + face);


    }
}

/*
C:\Users\A.R.M\.jdks\adopt-openjdk-14.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\lib\idea_rt.jar=58921:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath "N:\AP CSA\out\production\AP CSA" CoinTester
The 4 coins are worth $0.41
Flipping the coin resulted in Heads
Flipping the coin AGAIN resulted in Tails

Process finished with exit code 0

 */