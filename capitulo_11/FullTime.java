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
public class FullTime extends Student {

    public FullTime(String name) {
        super(name);
        super.time=true;
        setTuition(super.time);
    }
    
    public void setTuition(Boolean time){
        if(time){
            super.tuition=2000;
        }else{
            super.tuition=200;
        }
    }
    
    public void display(){
        System.out.println("Student name: "+super.getName()+"\nTuition: $"+super.getTuition());
    }
    
}
