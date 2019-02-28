/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo_11;

import java.util.ArrayList;



/**
 *
 * @author luisl
 */
public abstract class CardGame {
    protected final String SUITS []={"Spades","Hearts","Diamonds","Clubs"};
    protected final String CARDS []={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
    protected Integer nCards;
    protected ArrayList<Card> deck;
    protected ArrayList<Card> hand;
   
    public CardGame(){
        deck = new ArrayList<>();
        
        for(int i=0;i<13;i++){
            for(int j=0;j<4;j++){
                deck.add(new Card(CARDS[i],SUITS[j]));
            }
        }
        
    }   
    
    public abstract void setnCards();
    public abstract void display();

    public Integer getnCards() {
        return nCards;
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }
    
    public abstract void shuffle();

    public ArrayList<Card> getHand() {
        return hand;
    }
    
    
}
