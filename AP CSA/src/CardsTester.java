//Abdur Mohammed
//Period 5

public class CardsTester {
    public static void main(String[] args) {

        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();
        deck.deal(52);
        System.out.println("There are " + deck.cardsLeft() + " cards left in the deck.");


    }
}

/*
C:\Users\A.R.M\.jdks\adopt-openjdk-14.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\lib\idea_rt.jar=51185:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath "N:\AP CSA\out\production\AP CSA" CardsTester
3 of Spades
10 of Spades
2 of Diamonds
9 of Spades
4 of Clubs
5 of Hearts
Ace of Hearts
9 of Clubs
8 of Clubs
3 of Hearts
9 of Diamonds
Queen of Spades
4 of Diamonds
Jack of Hearts
King of Hearts
Ace of Spades
6 of Hearts
10 of Diamonds
King of Diamonds
Jack of Diamonds
3 of Clubs
4 of Hearts
7 of Spades
4 of Spades
5 of Diamonds
Ace of Diamonds
King of Spades
Jack of Clubs
8 of Spades
5 of Clubs
2 of Clubs
Queen of Clubs
6 of Diamonds
7 of Diamonds
7 of Clubs
10 of Clubs
10 of Hearts
Ace of Clubs
King of Clubs
2 of Hearts
9 of Hearts
Jack of Spades
Queen of Diamonds
3 of Diamonds
6 of Spades
Queen of Hearts
8 of Diamonds
2 of Spades
6 of Clubs
8 of Hearts
5 of Spades
7 of Hearts
There are 0 cards left in the deck.

Process finished with exit code 0
 */