class CardDriver{
    public static void main(String[] args){
        Deck deck = new Deck();
        int QCLocation = -1;

        System.out.println("Before Shuffle:");
        for(int i = 0; i < 52; i++){
            Card card = deck.dealCard();

            if(i % 13 == 0){
                System.out.println();
            }

            System.out.print(card.toString() + " ");
        }
        System.out.print("\n\n");

        
        deck.collectAllCards();
        deck.shuffleDeck(10);


        System.out.println("After 10 Swaps:");
        for(int i = 0; i < 52; i++){
            Card card = deck.dealCard();

            if(i % 13 == 0){
                System.out.println();
            }

            System.out.print(card.toString() + " ");
        }
        System.out.print("\n\n");
        

        deck.collectAllCards();
        deck.shuffleDeck();


        System.out.println("After Shuffle:");
        for(int i = 0; i < 52; i++){
            Card card = deck.dealCard();

            if(i % 13 == 0){
                System.out.println();
            }

            if(card.toString().equals("QC")){
                QCLocation = i + 1;
            }

            System.out.print(card.toString() + " ");
        }

        System.out.print("\n\nThe Queen of clubs was found at location " + QCLocation);
    }
}