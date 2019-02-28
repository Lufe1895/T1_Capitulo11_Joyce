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
public class Triangle2 extends GeometricFigures2 implements SidedObject{
    public Triangle2(Double height, Double width) {
        super(height, width);
        setType();
        setArea();
    }
    
    public void displaySides(){
        System.out.println("Nuber of sides: 3");
    }
    
    public void setArea(){
        super.area=super.height*super.width/2;
    }
    
    public void setType(){
        super.type="Triangle";
    }
    
    public void display(){
        displaySides();
        System.out.println("Area: "+super.getArea()+"\nType: "+super.getType()+"\n");
        
    }
}
