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
public class Jupiterian extends Alien{

    public Jupiterian(Integer nEyes, Integer nArms, String color) {
        super(nEyes, nArms, color);
    }

    public Integer getnEyes() {
        return nEyes;
    }

    public void setnEyes(Integer nEyes) {
        this.nEyes = nEyes;
    }

    public Integer getnArms() {
        return nArms;
    }

    public void setnArms(Integer nArms) {
        this.nArms = nArms;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
