package beggining.Arrays;

import java.util.Objects;

public class Card {

    private final String mast;
    private final String rank;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return mast.equals(card.mast) && rank.equals(card.rank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mast, rank);
    }

    public String getMast() {
        return mast;
    }

    public String getRank() {
        return rank;
    }


    public Card(String mast, String rank) {
        if (mast == null || rank == null) {
            throw new IllegalArgumentException();
        }
        this.mast = mast;
        this.rank = rank;
    }
    public String toString(){
        return "Card{" +
                "mast = " + mast + "\'" +
                ", rank = " + rank + "\'"+ "}" ;
    }
}
