public class Deck{
    private Card[] deck;
    private int cardsDealt;

    public Deck(){
        final String ranks[] = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        final String suits[] = {"S", "C", "D", "H"};
        this.deck = new Card[52];
        this.setCardsDealt(0);

        for(int i = 0; i < ranks.length * suits.length; i++){
            deck[i] = new Card(suits[i / 13], ranks[i % 13]);
        }
    }
    

    public int getCardsDealt(){
        return this.cardsDealt;
    }

    private void setCardsDealt(int cardsDealt){
        this.cardsDealt = cardsDealt;
    }

    public boolean isEmptyDeck(){
        return this.getCardsDealt() == 52;
    }

    public void collectAllCards(){
        this.setCardsDealt(0);

        for(int i = 0; i < this.deck.length; i++){
            deck[i].setAvailability(true);
        }
    }
    
    public Card dealCard(){
        if(!this.isEmptyDeck()){
            this.deck[this.getCardsDealt()].setAvailability(false);
            this.setCardsDealt(this.getCardsDealt() + 1);
            return this.deck[this.getCardsDealt() - 1].clone();
        }

        return null;
    }
    
    public void shuffleDeck(){
        for(int shuffles = 0; shuffles < 100; shuffles++){
            int a = (int)(Math.random() * 52);
            int b = (int)(Math.random() * 52);

            while(b == a) b = (int)(Math.random() * 52);

            Card temp = this.deck[a].clone();
            this.deck[a] = this.deck[b].clone();
            this.deck[b] = temp.clone();
        }
    }
    
    public void shuffleDeck(int swapCnt){
        for(int shuffles = 0; shuffles < swapCnt; shuffles++){
            int a = (int)(Math.random() * 52);
            int b = (int)(Math.random() * 52);

            while(b == a) b = (int)(Math.random() * 52);

            Card temp = this.deck[a].clone();
            this.deck[a] = this.deck[b].clone();
            this.deck[b] = temp.clone();
        }
    }
}