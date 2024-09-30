class CardDriver{
    public static void main(String[] args){
        String suits[] = {"S", "C", "D", "H"};
        String ranks[] = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        Card deck[] = new Card[52];
        int QCLocation = -1;

        for(int i = 0; i < 52; i++){
            deck[i] = new Card(suits[i / 13], ranks[i % 13]);
        }

        for(int i = 0; i < 100; i++){
            int p1 = (int)(Math.random() * 52);
            int p2;

            do { 
                p2 = (int)(Math.random() * 52);
            } while (p1 == p2);

            Card temp = deck[p1].clone();
            deck[p1] = deck[p2].clone();
            deck[p2] = temp;
        }

        for(int i = 0; i < 52; i++){
            if(i % 8 == 0){
                System.out.println();
            }

            if(deck[i].toString().equals("QC")){
                QCLocation = i + 1;
            }

            System.out.print(deck[i].toString() + " ");
        }

        if(QCLocation == -1){
            System.out.println("The Queen of Clubs was not found.");
        } else{
            System.out.print("\n\nThe Queen of clubs was found at location " + QCLocation);
        }
    }
}