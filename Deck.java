import java.util.*;
public class Deck {
    private ArrayList<Card> cards;
    public Deck() {
        cards = new ArrayList<>();
    }
    public void createDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(suit, rank));
            }
        }
        System.out.println("Deck created successfully.");
    }
    public void printDeck() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }
    public void printCard() {
        Random random = new Random();
        Card randomCard = cards.get(random.nextInt(cards.size()));
        System.out.println("Random card: " + randomCard);
    }
    public void sameCard() {
        Random random = new Random();
        Card referenceCard = cards.get(random.nextInt(cards.size()));
        System.out.println("Reference card: " + referenceCard);
        for (Card card : cards) {
            if (card.getSuit().equals(referenceCard.getSuit()) && card != referenceCard) {
                System.out.println("Card from the same suit: " + card);
                return;
            }
        }
        System.out.println("No card found from the same suit.");
    }
    public void compareCard() {
        Random random = new Random();
        int index1 = random.nextInt(cards.size());
        int index2 = random.nextInt(cards.size());
        Card card1 = cards.get(index1);
        Card card2 = cards.get(index2);
        System.out.println("Card 1: " + card1);
        System.out.println("Card 2: " + card2);
        if (card1.getSuit().equals(card2.getSuit()) || card1.getRank().equals(card2.getRank())) {
            System.out.println("The cards are comparable.");
        } else {
            System.out.println("The cards are not comparable.");
        }
    }
    public void findCard() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the rank of the card: ");
        String rank = scanner.next();
        System.out.print("Enter the suit of the card: ");
        String suit = scanner.next();
        Card targetCard = new Card(suit, rank);
        boolean found = false;
        for (Card card : cards) {
            if (card.equals(targetCard)) {
                System.out.println("Card found: " + card);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Card not found.");
        }
    }
    public void dealCard() {
        Random random = new Random();
        System.out.println("Dealing 5 random cards:");
        for (int i = 0; i < 5; i++) {
            Card randomCard = cards.get(random.nextInt(cards.size()));
            System.out.println(randomCard);
        }
    }
    public void shuffleDeck() {
        Collections.shuffle(cards);
        System.out.println("Deck shuffled successfully.");
    }
}