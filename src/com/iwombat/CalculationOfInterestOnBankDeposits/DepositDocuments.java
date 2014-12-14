package com.iwombat.CalculationOfInterestOnBankDeposits;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marzieh on 12/10/2014.
 * There is a List which name is depositDocumentsList and elements of it are Deposits' object.
 * Note: Deposit class is different with Deposits class.
 * In DepositDocuments class we implement structure of Input file which is a XML file with
 * frequent elements. These elements structure is implemented in Deposits class.
 */
@XmlRootElement(name = "deposits")
@XmlAccessorType(XmlAccessType.FIELD)
public class DepositDocuments  {
    @XmlElement(name = "deposit")
    public List<Deposits> depositDocumentsList = new ArrayList<Deposits>();

    public List<Deposits> getItemDocumentList() {
        return depositDocumentsList;
    }

    public void setItemDocumentList(List<Deposits> itemDocumentList) {
        this.depositDocumentsList = itemDocumentList;
    }
}
