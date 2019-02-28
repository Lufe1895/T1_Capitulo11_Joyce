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
public abstract class Loan implements LoanConstants {
    protected Integer loanNumbers;
    protected String lName;
    protected Double amount;
    protected Double interest;
    protected Integer term;
    protected Double total;

    public Loan(Integer loanNumbers, String lName, Double amount, int term) {
        this.loanNumbers = loanNumbers;
        this.lName = lName;
        this.amount=amount;
        this.term=term;
    }
    
    public abstract void setInterest();
    public Double getTotal(){
        return this.amount*this.interest;
    }
    
    public Integer getLoanNumbers() {
        return loanNumbers;
    }

    public String getlName() {
        return lName;
    }

    public Double getAmount() {
        return amount;
    }

    public Double getInterest() {
        return interest;
    }

    public Integer getTerm() {
        return term;
    }

    public static Double getmAmount() {
        return mAmount;
    }

    public static Integer getShort_term() {
        return short_term;
    }

    public static Integer getMedium_term() {
        return medium_term;
    }

    public static Integer getLong_term() {
        return long_term;
    }
    
    
}
