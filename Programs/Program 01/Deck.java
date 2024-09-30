import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        boolean[] myDeck = new boolean[52];

        final int cardsPerRow = 8;
        int cardsThisRow = 0;
        int myCard;
        initDeck(myDeck);
        System.out.println("\nHere is a shuffled deck ...\n");
        while (!emptyDeck(myDeck))
        {
            myCard = dealCard(myDeck);
            ++cardsThisRow;
            if (cardsThisRow <= cardsPerRow)
            {
                printCard(myCard);
                System.out.print(" ");
            }
            else
            {
                System.out.println("");
                cardsThisRow = 1;
                printCard(myCard);
                System.out.print(" ");
            }
        }
        System.out.println('\n');
    }


    // set the values of deck to indicate that they are all
    // present - not dealt yet.
    public static void initDeck(boolean[] deck){
        for(int i = 0; i < deck.length; i++){
            deck[i] = true;
        }
    }

    
    // returns whether or not all the cards in the deck
    // have already been dealt.
    public static boolean emptyDeck(boolean[] deck){
        for(int i = 0; i < deck.length; i++){
            if(deck[i]){
                return false;
            }
        }

        return true;
    }
    
    // returns a card (an int in the range 0 to 51) at random
    // that has not been dealt since the deck was initialize
    // via intDeck. Also notes (in deck) that this card is
    // no longer available.
    public static int dealCard(boolean[] deck){
        ArrayList<Integer> nums = new ArrayList<>();
        int index;

        for(int i = 0; i < deck.length; i++){
            if(deck[i]){
                nums.add(i);
            }
        }

        index = (int)(Math.random() * nums.size());
        deck[nums.get(index)] = false;

        return nums.get(index);
    }

    // given a card (an int in the range 0 to 51) prints
    // an appropriate representation of this card based
    // on a 1-1 and onto mapping of the set [0, 51] to
    // the cards described above.
    public static void printCard(int card){
        String[] ranks = new String[] {"A", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        char[] suits = new char[] {'S', 'C', 'H', 'D'};

        String rank = ranks[card % 13];
        char suit = suits[card / 13];

        System.out.print(rank + suit);
    }
};