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
public abstract class Building {
    private Integer sFootage;
    private String stories;

    public Building(Integer sFootage, String stories) {
        this.sFootage = sFootage;
        this.stories = stories;
    }

    public String getStories() {
        return stories;
    }

    public void setStories(String stories) {
        this.stories = stories;
    }

    public Integer getsFootage() {
        return sFootage;
    }

    public void setsFootage(Integer sFootage) {
        this.sFootage = sFootage;
    }
    
    
}
