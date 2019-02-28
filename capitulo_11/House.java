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
public class House extends Building{
    private Integer baths;
    private Integer rooms;

    public House(Integer baths, Integer rooms, Integer sFootage, String stories) {
        super(sFootage, stories);
        this.baths = baths;
        this.rooms = rooms;
    }

    public Integer getBaths() {
        return baths;
    }

    public void setBaths(Integer baths) {
        this.baths = baths;
    }

    public Integer getRooms() {
        return rooms;
    }

    public void setRooms(Integer rooms) {
        this.rooms = rooms;
    }
    
    
}
