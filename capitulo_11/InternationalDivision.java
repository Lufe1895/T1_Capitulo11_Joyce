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
public class InternationalDivision extends Division {
    private String country;
    private String language;

    public InternationalDivision(String country, String language, String name, String account) {
        super(name, account);
        this.country = country;
        this.language = language;
    }
    
    public void display(){
        System.out.println("International Division\nCountry: "+this.getCountry()+"\nName: "+super.getName()+"\nSpoken language: "+this.getLanguage()+"\nAccount: "+super.getAccount()+"\n\n");
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
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
