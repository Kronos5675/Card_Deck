public class Card {
    private String suit;
    private String rank;
    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }
    public String getSuit() {
        return suit;
    }
    public String getRank() {
        return rank;
    }
    @Override
    public String toString() {
        return rank + " of " + suit;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Card card = (Card) obj;
        return suit.equals(card.suit) && rank.equals(card.rank);
    }
}