// Main.java

/* Name: Anushka Chatterjee
   PRN: 23070126015
   Batch: AIML-A1 */

import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Print Deck");
            System.out.println("2. Print Card");
            System.out.println("3. Shuffle Deck");
            System.out.println("4. Deal 5 Random Cards");
            System.out.println("5. Find a Card");
            System.out.println("6. Compare Two Cards");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    deck.printDeck();
                    break;
                case 2:
                    System.out.print("Enter card index (0-51): ");
                    int index = scanner.nextInt();
                    deck.printCard(index);
                    break;
                case 3:
                    deck.shuffleDeck();
                    System.out.println("Deck shuffled!");
                    break;
                case 4:
                    deck.dealCard();
                    break;
                case 5:
                    System.out.print("Enter rank: ");
                    String rank = scanner.next();
                    System.out.print("Enter suit: ");
                    String suit = scanner.next();
                    Card found = deck.findCard(rank, suit);
                    if (found != null) {
                        System.out.println("Card found: " + found);
                    } else {
                        System.out.println("Card not found!");
                    }
                    break;
                case 6:
                    System.out.println("Comparing first two cards:");
                    System.out.println("Card 1: " + deck.deck.get(0));
                    System.out.println("Card 2: " + deck.deck.get(1));
                    System.out.println("Same suit? " + deck.sameCard(deck.deck.get(0), deck.deck.get(1)));
                    System.out.println("Same rank? " + deck.compareCard(deck.deck.get(0), deck.deck.get(1)));
                    break;
                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}
