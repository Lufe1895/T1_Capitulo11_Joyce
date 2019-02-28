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
public class DomesticDivision extends Division {
    private String state;

    public DomesticDivision(String state, String name, String account) {
        super(name, account);
        this.state = state;
    }
    
    public void display(){
        System.out.println("Domestic Division\nState: "+this.getState()+"\nDivision name: "+super.getName()+"\nAccount: "+super.getAccount()+"\n\n");
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
    
    
}
