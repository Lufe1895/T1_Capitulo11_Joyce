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
public final class Triangle extends GeometricFigure {

    public Triangle(Double height, Double width) {
        super(height, width);
        setType();
        setArea();
    }
    
    public void setArea(){
        super.area=super.height*super.width/2;
    }
    
    public void setType(){
        super.type="Triangle";
    }
    
    public void display(){
        System.out.println("Area: "+super.getArea()+"\nType: "+super.getType()+"\n");
    }
}
