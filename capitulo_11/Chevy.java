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
public final class Chevy extends Auto{

    public Chevy() {
        super();
        setMake("Chevy");
        setPrice(20000);
    }
    
    @Override
    public void setMake(String make){
        super.make=make;
    }
    
    @Override
    public void setPrice(int price){
        super.price=price;
    }
    
    @Override
    public String toString(){
        return String.format("Make: %s Cost: $%d\n\n",super.getMake(),super.getPrice());
    }
}
