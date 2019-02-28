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
public class IncomingPhoneCall extends PhoneCall {

    public IncomingPhoneCall(String pNumber) {
        super(pNumber);
        super.setCost(0.02);
    }
    
    @Override
    public String getPhoneNumber(){
        return String.format("%s",super.pNumber);
    }
    
    @Override
    public Double getPrice(){
        return super.cost;
    }
    
    @Override
    public String getInfo(){
        return String.format("Phone Number: %s Rate: $%f Price: $%f\n",this.getPhoneNumber(),this.getPrice(),this.getPrice());
    }
    
}
