//Abdur Mohammed
//Period 5

public class Card {

    //suit = clubs, diamonds, hearts, spades
    //rank = 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King, Ace


    String rank;
    String suit;

    public String[] Suit = {"Clubs", "Spades", "Hearts", "Diamonds"};
    public String[] Rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};


    public Card(int suit, int rank){
        this.suit = Suit[suit];
        this.rank = Rank[rank];
    }

    public String toString(){
        return rank + " of " + suit;
    }

}
