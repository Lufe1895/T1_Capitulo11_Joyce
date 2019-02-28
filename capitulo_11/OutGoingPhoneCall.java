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
public class OutGoingPhoneCall extends PhoneCall {
    private final Integer minutes;
    private static final Double COST=0.04;

    public OutGoingPhoneCall(String pNumber,int minutes) {
        super(pNumber);
        this.minutes=minutes;
        super.setCost(price());
    }
    
    private Double price(){
        return this.minutes * COST;
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
        return String.format("Phone Number: %s Rate: $%f Price: $%f\n",this.getPhoneNumber(),OutGoingPhoneCall.COST,this.getPrice());
    }
    
}
