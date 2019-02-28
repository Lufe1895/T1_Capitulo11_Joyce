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
public final class NonFiction extends Book {

    public NonFiction(String title) {
        super();
        super.title=title;
        setPrice(37.99);
    }
    
    @Override
    public void setPrice(Double price){
        super.price=price;
    }
    
    @Override
    public String toString(){
        return String.format("Book's title: %s\nPrice: %f\n\n",super.getTitle(),super.getPrice());
    }
}
