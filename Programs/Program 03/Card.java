class Card{
    private String suit;
    private String rank;

    // default card is ace of clubs
    public Card(){
        setRank("A");
        setSuit("C");
    }

    public Card(String suit, String rank){
        setRank(rank);
        setSuit(suit);
    }

    @Override
    public Card clone(){
        return new Card(getSuit(), getRank());
    }

    public boolean equals(Card guest){
        String guestRank = guest.getRank();
        String guestSuit = guest.getSuit();
        String thisRank = this.getRank();
        String thisSuit = this.getSuit();

        return guestRank.equals(thisRank) && guestSuit.equals(thisSuit);
    }

    @Override
    public String toString(){
        return this.getRank() + this.getSuit();
    }

    private void setRank(String rank){
        final String validRanks[] = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        for(String s : validRanks){
            if(s.equals(rank)){
                this.rank = rank;
                return;
            }
        }
    }

    private void setSuit(String suit){
        final String validSuits[] = {"S", "C", "D", "H"};

        for(String s : validSuits){
            if(s.equals(suit)){
                this.suit = suit;
                return;
            }
        }
    }

    public String getRank(){
        return this.rank;
    }

    public String getSuit(){
        return this.suit;
    }
}