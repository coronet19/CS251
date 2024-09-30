import java.util.ArrayList;

public class Deck{
    private boolean[] deck;

    public Deck(){
        this.deck = new boolean[52];
    }


    // set the values of deck to indicate that they are all
    // pressent - not delt yet.
    public void initDeck(){
        for(int i = 0; i < this.deck.length; i++){
            this.deck[i] = true;
        }
    }

    
    // returns wheather or not all the cards in the deck
    // have already been delt.
    public boolean emptyDeck(){
        for(int i = 0; i < this.deck.length; i++){
            if(this.deck[i]){
                return false;
            }
        }

        return true;
    }
    
    // returns a card (an int in the range 0 to 51) at random
    // that has not been delt since the deck was initialize
    // via intDeck. Also notes (in deck) that this card is
    // no longer available.
    public int dealCard(){
        ArrayList<Integer> nums = new ArrayList<>();
        int index;

        for(int i = 0; i < deck.length; i++){
            if(this.deck[i]){
                nums.add(i);
            }
        }

        index = (int)(Math.random() * nums.size());
        this.deck[nums.get(index)] = false;

        return nums.get(index);
    }

    // given a card (an int in the range 0 to 51) returns
    // an appropriate String repressentation of this card
    // based on a 1-1 and onto mapping of the set [0, 51]
    // to the cards described above.
    public static String cardToString(int card){
        String[] ranks = new String[] {"A", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] suits = new String[] {"S", "C", "H", "D"};

        String rank = ranks[card % 13];
        String suit = suits[card / 13];

        return rank + suit;
    }
};