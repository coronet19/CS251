class Card{
    private String suit;
    private String rank;
    private boolean isDealt;

    // default card is ace of clubs
    public Card(){
        this.setRank("A");
        this.setSuit("C");
        this.setAvailability(true);
    }

    public Card(String suit, String rank){
        this.setRank(rank);
        this.setSuit(suit);
        this.setAvailability(true);
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

    public boolean isDealt(){
        return this.isDealt;
    }

    public void setAvailability(boolean availability){
        this.isDealt = availability;
    }

    public String getRank(){
        return this.rank;
    }

    public String getSuit(){
        return this.suit;
    }
}