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
public class Square2 extends GeometricFigures2 implements SidedObject{
    public Square2(Double height, Double width) {
        super(height, width);
        setType();
        setArea();
    }
    
    public void displaySides(){
        System.out.println("Nuber of sides: 4");
    }
    
    public void setArea(){
        super.area=super.height*super.width;
    }
    
    public void setType(){
        super.type="Square";
    }
    
    public void display(){
        displaySides();
        System.out.println("Area: "+super.getArea()+"\nType: "+super.getType()+"\n");
        
    }
}
