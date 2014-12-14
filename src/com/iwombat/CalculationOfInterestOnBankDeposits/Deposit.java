package com.iwombat.CalculationOfInterestOnBankDeposits;


import java.lang.*;
import java.math.BigDecimal;
import java.lang.reflect.*;
import  java.util.*;

/**
 * Created by Marzieh on 12/9/2014.
 * This class create an account's information for each
 * customer; moreover, calculate the payed interest of deposit for each depositor
 * by utilizing an object of CalculationOfPayedInterest class and invoke getPayedInterest().
 * In addition, this class is a super class of Qarz, ShortTerm, and LongTerm classes that each one
 * are subclasses showed different deposit types(inheritance part implementation of this project).
 * Deposit class implements the Comparable interface as well; furthermore this issue helps us to
 * sort a list of object of this class by invoking the compareTo method which implemented in it.
 */
public class Deposit implements Comparable<Deposit>{
    private int customerNumber;
    private String depositType;
    private BigDecimal depositBalance;
    private int durationInDays;
    BigDecimal payedInterest;
    public int compareTo(Deposit o)
    {
       return (-1*payedInterest.compareTo(o.getPayedInterest()));
    }
    public Deposit()
    {
        customerNumber = 0;
        depositType = "";
        depositBalance = new BigDecimal(0.0);
        durationInDays = 0;
    }
    public Deposit(int cn, String dt, BigDecimal db, int dI)
    {
        customerNumber = cn;
        depositType = dt;
        depositBalance = db;
        durationInDays = dI;
    }
    public void setCustomerNumber(int cn)
    {
        customerNumber = cn;
    }
    public int getCustomerNumber()
    {
        return customerNumber;
    }

    public void setDepositType(String depositType)
    {
        this.depositType = depositType;
    }

    public String getDepositType()
    {
        return depositType;
    }

    public void setDepositBalance(BigDecimal depositBalance)
    {
        this.depositBalance = depositBalance;
    }

    public BigDecimal getDepositBalance()
    {
        return depositBalance;
    }

    public void setDurationInDays(int durationInDays)
    {
        this.durationInDays = durationInDays;
    }

    public int getDurationInDays()
    {
        return durationInDays;
    }

    public BigDecimal getPayedInterest()
    {
        return payedInterest;
    }

}
