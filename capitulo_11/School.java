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
public class School extends Building {
    private Integer clasrooms;
    private String level;

    public School(Integer clasrooms, String level, Integer sFootage, String stories) {
        super(sFootage, stories);
        this.clasrooms = clasrooms;
        this.level = level;
    }

    public Integer getClasrooms() {
        return clasrooms;
    }

    public void setClasrooms(Integer clasrooms) {
        this.clasrooms = clasrooms;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
    
    
}
