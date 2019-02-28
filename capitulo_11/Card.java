/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo_11;

/**
 *
 * @author luisl
 */
public class Card {
    private String card;
    private String suit;

    public Card(String card, String suit) {
        this.card = card;
        this.suit = suit;
    }

    public String getCard() {
        return card;
    }

    public String getSuit() {
        return suit;
    }
    
}
