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
public final class SevenDaySubscriber extends NewspaperSubscriber{
    public static final Double RATE=4.5;
    public static final String SERVICE="Seven Day Subscriber";

    public SevenDaySubscriber(String street) {
        super(street);
        setRate(RATE);
    }
    
    public String toString(){
        return String.format("Street: %s\nRate: $%f\nService: %s\n",super.getStreet(),this.RATE,this.SERVICE);
    }
    
    @Override
    public void setRate(Double rate){
        super.rate=rate;
    }
    
    public Boolean equals(String word){
        return this.street == word;
    }

    public String getSERVICE() {
        return SERVICE;
    }
    
    
}
