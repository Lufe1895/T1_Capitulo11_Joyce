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
public final class WeekendSubscriber extends NewspaperSubscriber {
    public static final Double RATE=2.0;
    public static final String SERVICE="Weekend Subscriber";

    public WeekendSubscriber(String street) {
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
    
    @Override
    public Boolean equals(String word){
        return this.street == word;
    }
    
    public String getSERVICE() {
        return SERVICE;
    }
}
