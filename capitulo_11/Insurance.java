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
public abstract class Insurance {
    protected String type;
    protected Double rate;

    public Insurance(String type) {
        this.type = type;
        this.rate=0.0;
    }

    public String getType() {
        return type;
    }

    public Double getRate() {
        return rate;
    }
    
    public abstract void setCost(Double cost);
    public abstract void display();
}
