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
public abstract class Auto {
    protected String make;
    protected Integer price;
    
    public Auto(){
        this.make="";
        this.price=0;
    }

    public String getMake() {
        return make;
    }

    public abstract void setMake(String make);

    public Integer getPrice() {
        return price;
    }

    public abstract void setPrice(int price);
    
    public abstract String toString();
    
}
