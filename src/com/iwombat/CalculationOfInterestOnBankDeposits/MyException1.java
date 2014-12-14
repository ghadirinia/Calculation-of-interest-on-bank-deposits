package com.iwombat.CalculationOfInterestOnBankDeposits;

/**
 * Created by Marzieh on 12/11/2014.
 * We implement this class for handling an exception.
 * this exception accure when type of deposit in input file is incorrect
 * Incorrect types are except LongTerm, ShortTerm, and qarz.
 */
public class MyException1 extends  Exception {
    private String ExceptionText;
    public MyException1(String depositType)
    {
        ExceptionText = depositType;
    }
    public String getExceptionText()
    {
        return ExceptionText;
    }
}
