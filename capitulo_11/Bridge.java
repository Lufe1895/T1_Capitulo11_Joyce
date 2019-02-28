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
public final class Bridge extends CardGame{
    public Bridge() {
        super();
        setnCards();
        shuffle();
    }
    
    public void setnCards(){
        super.nCards=13;
    }
    
    public void display(){
        for(Card i:super.hand){
            System.out.println(i.getCard()+" of "+i.getSuit());
        }
    }
    
    public void shuffle(){
        this.hand = new ArrayList<>();
        
        for(int i = 0 ; i<this.nCards ; i++){
            this.hand.add((this.deck.get((int)(Math.random()*52))));
        }
        
    }
}
