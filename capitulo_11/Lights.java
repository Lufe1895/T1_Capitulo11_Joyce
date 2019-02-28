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
public class Lights extends Turner{
    public static final String ACTION="Changing the state of the lights (On/Off)";

    public Lights() {
        super();
        setAction(ACTION);
    }
    
    public void setAction(String action){
        super.action=action;
    }
}
