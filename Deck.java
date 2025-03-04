// Deck.java
import java.util.*;

class Deck {
    ArrayList<Card> deck;

    public Deck() {
        this.deck = new ArrayList<>();
        createDeck();
    }

    public void createDeck() {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suits = {"Clubs", "Spades", "Diamonds", "Hearts"};

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(new Card(rank, suit));
            }
        }
    }

    public void printDeck() {
        for (Card card : deck) {
            System.out.println(card);
        }
    }

    public void printCard(int index) {
        if (index >= 0 && index < deck.size()) {
            System.out.println(deck.get(index));
        } else {
            System.out.println("Invalid index!");
        }
    }

    public boolean sameCard(Card card1, Card card2) {
        return card1.getSuit().equals(card2.getSuit());
    }

    public boolean compareCard(Card card1, Card card2) {
        return card1.getRank().equals(card2.getRank());
    }

    public Card findCard(String rank, String suit) {
        for (Card card : deck) {
            if (card.getRank().equals(rank) && card.getSuit().equals(suit)) {
                return card;
            }
        }
        return null;
    }

    public void dealCard() {
        Collections.shuffle(deck);
        System.out.println("Dealing 5 random cards:");
        for (int i = 0; i < 5; i++) {
            System.out.println(deck.get(i));
        }
    }

    public void shuffleDeck() {
        Collections.shuffle(deck);
    }
}
