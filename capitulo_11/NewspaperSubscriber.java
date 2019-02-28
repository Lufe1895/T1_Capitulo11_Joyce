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
public abstract class NewspaperSubscriber {
    protected String street;
    protected Double rate;

    public NewspaperSubscriber(String street) {
        this.street = street;
        this.rate = 0.0;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Double getRate() {
        return rate;
    }

    public abstract void setRate(Double rate);
    public abstract Boolean equals(String word);
    public abstract String getSERVICE();
    public abstract String toString();
    
}
