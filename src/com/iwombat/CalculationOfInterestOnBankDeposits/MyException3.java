package com.iwombat.CalculationOfInterestOnBankDeposits;

/**
 * Created by Ermia on 12/11/2014.
 * We implement this class for handling an exception.
 * This exception accure when duration in days is zero or less than zero.
 */
public class MyException3 extends Exception {
    private String ExceptionText;
    public MyException3(int durationInDays)
    {
        ExceptionText = ""+ durationInDays;
    }
    public String getExceptionText()
    {
        return  ExceptionText;
    }
}
