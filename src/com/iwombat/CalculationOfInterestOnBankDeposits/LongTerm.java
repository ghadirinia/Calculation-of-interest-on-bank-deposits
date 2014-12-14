package com.iwombat.CalculationOfInterestOnBankDeposits;

import java.math.BigDecimal;

/**
 * Created by Marzieh on 12/9/2014.
 * This class inheritance from Deposit class and using the idea of Polymorphism in JAVA.
 * Downcasting in java is not supported; as a result , we have to implement downCastingDeposit in subclasses
 * of Deposit class to do this act.
 * CalculatePayedInterest() method calculate payed interest and
 * has various implementation in each subclass of Deposit.
 * LongTerm subclass maintain information of long term deposit type.
 */
public class LongTerm extends Deposit{
    public LongTerm(){super();}
    public LongTerm(int cn, String dt, BigDecimal db, int dI)
    {
        super(cn,dt,db,dI);
    }
    public void CalculatePayedInterest() throws  ArithmeticException {
        CalculationOfPayedInterest cInterest = new CalculationOfPayedInterest(getDepositBalance(),0.2, getDurationInDays());
        payedInterest = cInterest.getPayedInterest();
    }
    public void downCastingDeposit( Deposit deposit )
    {
        this.setCustomerNumber( deposit.getCustomerNumber() );
        this.setDepositType( deposit.getDepositType() );
        this.setDepositBalance( deposit.getDepositBalance() );
        this.setDurationInDays( deposit.getDurationInDays() );
    }
}
