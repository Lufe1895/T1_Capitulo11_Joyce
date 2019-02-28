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
public abstract class Element {
    protected String symbol;
    protected Integer number;
    protected Double weight;

    public Element(String symbol, Integer number, Double weight) {
        this.symbol = symbol;
        this.number = number;
        this.weight = weight;
    }
    
    public abstract String describeElement();

    public String getSymbol() {
        return symbol;
    }

    public Integer getNumber() {
        return number;
    }

    public Double getWeight() {
        return weight;
    }
    
    
}
