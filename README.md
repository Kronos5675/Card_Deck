# Card_Deck

This Java project implements a card deck management system with various operations.

## Main.java
- `main`: Main method to run the menu-driven card deck management system.

## Card.java
- `Card`: Constructor to initialize a playing card with a given suit and rank.
- `getSuit`: Retrieves the suit of the card.
- `getRank`: Retrieves the rank of the card.
- `toString`: Generates a string representation of the card.
- `equals`: Compares two cards for equality based on their suit and rank.

## Deck.java
- `Deck`: Constructor to initialize an empty deck of cards.
- `createDeck`: Generates a standard deck of 52 playing cards.
- `printDeck`: Prints all cards in the deck.
- `printCard`: Prints a random card from the deck.
- `sameCard`: Finds and prints a card from the same suit as a randomly selected reference card.
- `compareCard`: Compares two randomly selected cards from the deck for similarity in either rank or suit.
- `findCard`: Searches for a specific card in the deck based on user input of suit and rank.
- `dealCard`: Deals 5 random cards from the deck.
- `shuffleDeck`: Shuffles the deck of cards.
