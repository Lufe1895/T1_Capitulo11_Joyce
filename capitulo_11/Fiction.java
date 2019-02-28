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
public final class Fiction extends Book {

    public Fiction(String name) {
        super();
        super.title=name;
        setPrice(24.99);
    }
    
    /**
     *
     * @param price
     */
    @Override
    public void setPrice(Double price){
        super.price=price;
    }
    
    @Override
    public String toString(){
        return String.format("Book's title: %s\nPrice: %f\n\n",super.title,super.price);
    }
    
}
