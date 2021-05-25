package beggining.Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CardMain {

    private String mast;
    private String rank;

    public static void main (String[] args){


        Card card1 = new Card("Piki", "6");
        Card card2 = new Card("Piki", "7");
        Card card3 = new Card("Piki", "8");
        Card card4 = new Card("Piki", "9");
        Card card5 = new Card("Piki", "10");
        Card card6 = new Card("Piki", "V");
        Card card7 = new Card("Piki", "Q");
        Card card8 = new Card("Piki", "K");
        Card card9 = new Card("Piki", "T");


        Card card10 = new Card("Kresti", "6");
        Card card11 = new Card("Kresti", "7");
        Card card12 = new Card("Kresti", "8");
        Card card13 = new Card("Kresti", "9");
        Card card14 = new Card("Kresti", "10");
        Card card15 = new Card("Kresti", "V");
        Card card16 = new Card("Kresti", "Q");
        Card card17 = new Card("Kresti", "K");
        Card card18 = new Card("Kresti", "T");


        Card card19 = new Card("Bubi", "6");
        Card card20 = new Card("Bubi", "7");
        Card card21 = new Card("Bubi", "8");
        Card card22 = new Card("Bubi", "9");
        Card card23 = new Card("Bubi", "10");
        Card card24 = new Card("Bubi", "V");
        Card card25 = new Card("Bubi", "Q");
        Card card26 = new Card("Bubi", "K");
        Card card27 = new Card("Bubi", "T");


        Card card28 = new Card("Chervi", "6");
        Card card29 = new Card("Chervi", "7");
        Card card30 = new Card("Chervi", "8");
        Card card31 = new Card("Chervi", "9");
        Card card32 = new Card("Chervi", "10");
        Card card33 = new Card("Chervi", "V");
        Card card34 = new Card("Chervi", "Q");
        Card card35 = new Card("Chervi", "K");
        Card card36 = new Card("Chervi", "T");


        List<Card> cardList = new ArrayList<>();

        cardList.add(card1);
        cardList.add(card2);
        cardList.add(card3);
        cardList.add(card4);
        cardList.add(card5);
        cardList.add(card6);
        cardList.add(card7);
        cardList.add(card8);
        cardList.add(card9);
        cardList.add(card10);
        cardList.add(card11);
        cardList.add(card12);
        cardList.add(card13);
        cardList.add(card14);
        cardList.add(card15);
        cardList.add(card16);
        cardList.add(card17);
        cardList.add(card18);
        cardList.add(card19);
        cardList.add(card20);
        cardList.add(card21);
        cardList.add(card22);
        cardList.add(card23);


        Set<Card> cardSet = new HashSet<>(cardList);
            for (Card card : cardSet) {
            }
        int size = cardList.size();
        System.out.println(size);


    }
}
