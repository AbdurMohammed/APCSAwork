//Abdur Mohammed
//Period 5

import java.util.ArrayList;

public class DeckOfCards {

    ArrayList<Card> newDeck = new ArrayList<Card>();

    public DeckOfCards() {
        for (int suit = 0; suit <= 3; suit++){
            for(int rank = 0; rank <= 12; rank++){
                Card card = new Card(suit, rank);
                newDeck.add(card);
            }
        }

    }


     public void shuffle(){

        ArrayList<Card> tempDeck = new ArrayList<Card> ();

        while(newDeck.size() > 0){

            int index = (int) (Math.random() * newDeck.size());
            tempDeck.add(newDeck.get(index));
            newDeck.remove(index);

       }
        newDeck = tempDeck;
    }

int cardsDealt = 0;


    public void deal(int numToDeal) {
        for (int i = 0; i < numToDeal; i++) {
            Card currentCard = newDeck.get(i);
            System.out.println(currentCard.toString());
            cardsDealt++;
        }
    }



    public int cardsLeft(){

        return 52 - cardsDealt;

    }

}
