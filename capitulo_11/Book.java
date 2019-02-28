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
public abstract class Book {
    protected String title;
    protected Double price;

    public Book(String title,Double price) {
        this.title=title;
        this.price=price;
    }
    
    public Book(){
        this.title="";
        this.price=0.0;
    }
    
    @Override
    public String toString(){
        return String.format("Book's title: %s\nPrice: %f\n\n",this.title,this.price);
    }

    public String getTitle() {
        return title;
    }

    public Double getPrice() {
        return price;
    }
    
    public abstract void setPrice(Double price);
}
