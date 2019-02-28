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
public abstract class PhoneCall {
    protected String pNumber;
    protected Double cost;

    public PhoneCall(String pNumber) {
        this.pNumber = pNumber;
        this.cost=0.0;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
    
    public abstract String getPhoneNumber();
    public abstract Double getPrice();
    public abstract String getInfo();
    
}
