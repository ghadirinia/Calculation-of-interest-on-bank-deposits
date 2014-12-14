package com.iwombat.CalculationOfInterestOnBankDeposits;

import java.math.*;

/**
 * Created by Marzieh on 12/9/2014.
 * In this class one method define which in it payed interest calculated for an account information.
 * Deposit balance, interest rate, and duration in days of each deposit are necessary for
 * calculation of payed interest; therefor, each account must create an object of this class and
 * send aforementioned vital parameters to constructor of object of this class.
 */
public class CalculationOfPayedInterest {
    private BigDecimal payedInterest;
    private BigDecimal depositBalance;
    private double interestRate;
    private int durationInDays;
    public  CalculationOfPayedInterest(BigDecimal Db, double Ir, int Dd )//constructor
    {
        interestRate = Ir;
        depositBalance = Db;
        durationInDays = Dd;
    }
    public BigDecimal getPayedInterest() throws  ArithmeticException
    {
        MathContext mc = new MathContext(4); // 4 precision
        payedInterest = depositBalance.multiply(new BigDecimal(interestRate),mc);
        payedInterest = payedInterest.multiply(new BigDecimal(durationInDays),mc);
        payedInterest = payedInterest.divide(new BigDecimal(36500),3, RoundingMode.CEILING);
        return payedInterest;
    }
}
