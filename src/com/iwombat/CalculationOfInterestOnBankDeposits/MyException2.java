package com.iwombat.CalculationOfInterestOnBankDeposits;

import java.math.BigDecimal;

/**
 * Created by Marzieh on 12/11/2014.
 * We implement this class for handling an exception.
 * This exception accure when deposit balance is less than zero and being negative in input file.
 */
public class MyException2 extends  Exception {

    private String depositBalance;
    public MyException2(BigDecimal depositBalance)
    {
        this.depositBalance = ""+depositBalance;
    }
    public String getExceptionText()
    {
        return depositBalance;
    }
}
