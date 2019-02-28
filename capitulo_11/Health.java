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
public final class Health extends Insurance {
    private static final Double COST= 196.0;

    public Health(String type) {
        super(type);
        setCost(COST);
    }
    
    public void setCost(Double cost){
        super.rate=cost;
    }
    
    public void display(){
        System.out.println("Type of Insurance: "+super.getType()+"\nCost: $"+super.getRate()+"\n\n");
    }
}
