package com.iwombat.CalculationOfInterestOnBankDeposits;

import java.math.BigDecimal;

/**
 * Created by Marzieh on 12/9/2014.
 * This class inheritance from Deposit class and using the idea of Polymorphism in JAVA.
 * Downcasting in java is not supported; as a result , we have to implement downCastingDeposit in subclasses
 * of Deposit class to do this act.
 * CalculatePayedInterest() method calculate payed interest and
 * has various implementation in each subclass of Deposit.
 * Qarz subclass maintain information of qarz deposit type.
 */

 public class Qarz extends Deposit {
    public Qarz(){super();}
    public Qarz(int cn, String dt, BigDecimal db, int dI)
    {
       super(cn,dt,db,dI);
    }
    public void CalculatePayedInterest()
    {
        payedInterest = new BigDecimal(0.0);
    }
    public void downCastingDeposit( Deposit deposit )
    {
        this.setCustomerNumber( deposit.getCustomerNumber() );
        this.setDepositType( deposit.getDepositType() );
        this.setDepositBalance( deposit.getDepositBalance() );
        this.setDurationInDays( deposit.getDurationInDays() );
    }
}
