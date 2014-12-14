package com.iwombat.CalculationOfInterestOnBankDeposits;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;


/**
 * Created by Marzieh on 12/9/2014.
 *  The elements structure  of branches that nested one layer in XML input file is implemented in this class.

 */

@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class Deposits {
    @XmlElement(name = "customerNumber")
    private int customerNumber;
    public void setCustomerNumber(int customerNumber)
    {
        this.customerNumber = customerNumber;
    }

    public int getCustomerNumber()
    {
        return customerNumber;
    }
    @XmlElement(name = "depositType")
    private String depositType;
    public void setDepositType(String depositType)
    {
        this.depositType = depositType;
    }

    public String getDepositType()
    {
        return depositType;
    }
    @XmlElement(name = "depositBalance")
    private BigDecimal depositBalance;
    public void setDepositBalance(BigDecimal depositBalance)
    {
        this.depositBalance = depositBalance;
    }

    public BigDecimal getDepositBalance()
    {
        return depositBalance;
    }
    @XmlElement(name = "durationInDays")
    private int durationInDays;
    public void setDurationInDays(int durationInDays)
    {
        this.durationInDays = durationInDays;
    }

    public int getDurationInDays()
    {
        return  durationInDays;
    }
}
