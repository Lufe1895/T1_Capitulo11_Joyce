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
public class NonMetalElement extends Element {
    public static final String PROPERTIES= "They are not good conductors.";

    public NonMetalElement(String symbol, Integer number, Double weight) {
        super(symbol, number, weight);
    }
    
    public String describeElement(){
        return String.format("Non Metal Element\nSymbol: %s\nAtomic Number: %d\nAtomic Weight: %f\nPropertie: %s\n\n",super.getSymbol(),super.getNumber(),super.getWeight(),NonMetalElement.PROPERTIES);
    }
    
}
