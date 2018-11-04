package com.company;


public class CardGroup {
    private Card c1;
    private Card c2;
    private Card c3;

    public CardGroup(Card c1, Card c2, Card c3) {
        // TODO 3.1
        this.c1 = c1 ;
        this.c2 = c2 ;
        this.c3 = c3 ;


    }

    /*
     * Return the number of cards with the same number
     */
    public int numOfSameNumber() {
        // TODO 3.2
        int num = 1;
        if (c1.getNumber() == c2.getNumber() && c1.getNumber() == c3.getNumber()) {
            num = 3;
        } else {
            if (c1.getNumber() == c2.getNumber()) {
                num++;
            }
            if (c1.getNumber() == c3.getNumber()) {
                num++;
            }
            if (c3.getNumber() == c2.getNumber()) {
                num++;
            }
        }
        return num;
    }

    /*
     * Return the sum of all 3 numbers.
     */
    public int sumOfNumbers() {
        int sum;
        sum = c1.getNumber() + c2.getNumber() + c3.getNumber();

        return sum; // to be replaced
    }

    public int suitIfSame() {
        if (c1.getSuit().equals(c2.getSuit()) && c1.getSuit().equals(c3.getSuit()))
            return 1 ;
        else
            return 0;

    }

    /*
     * Compare if it is bigger than CardGroup c
     * @param c another CardGroup
     * @return 1: bigger than c; 0: the same; -1: smaller than c.
     */
    public int compare(CardGroup c) {
        int flag;
        //3 张牌花色相同
        if(c.suitIfSame() == 1)
            flag =3;
       //3 张 数字相同
        else if(numOfSameNumber() == 3)
            flag = 2;
        //2 张数字相同
        else if(numOfSameNumber() == 2)
            flag =1;
        else
            flag = 0;

        return flag; // to be replaced
    }


}