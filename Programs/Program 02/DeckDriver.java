public class DeckDriver{
    public static void main(String[] args){
        Deck deck = new Deck();
        deck.initDeck();

        SmartDeck smartDeck = new SmartDeck();
        smartDeck.initDeck();

        final int cardsPerRow = 8;
        int cardsThisRow = 0;
        int myCard;
        
        System.out.println("\nRun 1: - with Deck class -");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Here is a shuffled deck ...\n");

        while (!deck.emptyDeck()){
            myCard = deck.dealCard();
            cardsThisRow++;

            if (cardsThisRow <= cardsPerRow){
                System.out.print(Deck.cardToString(myCard) + " ");
            } else{
                System.out.println("");
                cardsThisRow = 1;
                System.out.print(Deck.cardToString(myCard) + " ");
            }
        }
        System.out.println('\n');

        cardsThisRow = 0;

        System.out.println("\nRun 2: - with SmartDeck class -");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Here is a shuffled deck ...\n");

        while (!smartDeck.emptyDeck()){
            myCard = smartDeck.dealCard();
            cardsThisRow++;

            if (cardsThisRow <= cardsPerRow){
                System.out.print(SmartDeck.cardToString(myCard) + " ");
            } else {
                System.out.println("");
                cardsThisRow = 1;
                System.out.print(SmartDeck.cardToString(myCard) + " ");
            }
        }
        System.out.println('\n');
    }
}