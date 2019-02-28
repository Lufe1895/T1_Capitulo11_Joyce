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
public abstract class GeometricFigures2 {
    protected Double height;
    protected Double width;
    protected String type;
    protected Double area;

    public GeometricFigures2(Double height, Double width) {
        this.height = height;
        this.width = width;
        this.area=0.0;
        this.type="";
    }
    
    public abstract void setArea();
    public abstract void setType();
    public abstract void display();

    public void setHeight(Double height) {
        this.height = height;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public Double getWidth() {
        return width;
    }

    public String getType() {
        return type;
    }

    public Double getArea() {
        return area;
    }
}
