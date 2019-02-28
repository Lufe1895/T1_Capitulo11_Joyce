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
public abstract class Turner {
    protected String action;

    public Turner() {
        this.action="";
    }

    public String getAction() {
        return action;
    }
    
    public abstract void setAction(String action);
    
}
