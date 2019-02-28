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
public class PersonalLoan extends Loan {
        public PersonalLoan(Integer loanNumbers, String lName, Double amount,int term) {
        super(loanNumbers, lName, amount, term);
        setInterest();
    }
    
    public void setInterest(){
        super.interest=1.02;
    }
}
