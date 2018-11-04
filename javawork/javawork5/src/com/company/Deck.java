package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private ArrayList<Card> cards;
    Random random;

    public Deck() {
        this.cards = new ArrayList<Card>();
        this.random = new Random();
        // create all the cards
        this.generateDeck();
    }

    /*
     * Generate all the cards for a deck
     * the cards are stored in the member variable - cards
     */
    private void generateDeck() {
        // TODO 3.1

        String[] suits = {"黑桃", "红桃", "梅花", "方块"};

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < suits.length; j++) {

                cards.add(new Card(numbers[i], suits[j]));

            }

        }
    }

    /*
     * Return a random card, remove it from the deck
     */
    public Card getRandomCard() {



        int index = this.random.nextInt(1);

        return cards.get(index);

    }

    /*
     * Create a CardGroup by picking 3 cards randomly
     */
    public CardGroup createRandomCardGroup() {
        // TODO 3.1

        getRandomCard();

        Card c1, c2, c3;
        c1 = getRandomCard();
        c2 = getRandomCard();
        c3 = getRandomCard();

        CardGroup cardgroup;
        cardgroup = new CardGroup(c1, c2, c3);

        return cardgroup; //
    }

    public static void main(String[] args) {
        Deck deck = new Deck();
        CardGroup c1 = deck.createRandomCardGroup();
        CardGroup c2 = deck.createRandomCardGroup();
        CardGroup c3 = deck.createRandomCardGroup();

        // TODO 3.4
        // print out the biggest CardGroup
        if (c1.compare(c1) > c2.compare(c2) && c1.compare(c1)>c3.compare(c3))
            System.out.println(c1);
       else if (c2.compare(c2) > c3.compare(c3) && c2.compare(c2)>c1.compare(c1))
            System.out.println(c2);
        else if (c3.compare(c3) > c2.compare(c2) && c3.compare(c3)>c1.compare(c1))
            System.out.println(c3);
        else
            System.out.println("有相同的");

    }

}
