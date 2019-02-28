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
public abstract class Student {
    protected String name;
    protected Boolean time;
    protected Integer tuition;

    public Student(String name) {
        this.name = name;
        this.time = time;
    }
    
    public abstract void setTuition(Boolean time);
    public abstract void display();

    public String getName() {
        return name;
    }

    public Boolean getTime() {
        return time;
    }

    public Integer getTuition() {
        return tuition;
    }
    
    
}
