package com.iwombat.CalculationOfInterestOnBankDeposits;

import java.io.*;
import java.nio.channels.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;



/**
 * Created by Marzieh on 12/9/2014.
 * In this Class information from XML input file read and parsed.
 * Method readXML read xml file data by utilizing jaxb unmarshaller.
 */
public class ReadingAndParsingInputFile {
    public DepositDocuments readXML(String filePathName )
    {
        File file = null;
        DepositDocuments depositsList = null;
        try
        {
            file = new File(filePathName);
            JAXBContext jaxbContext = JAXBContext.newInstance(DepositDocuments.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            depositsList = (DepositDocuments) jaxbUnmarshaller.unmarshal(file);
        } catch (JAXBException e) {
            System.out.println("JAXBException:");
            e.printStackTrace();
        }
        return depositsList;
    }
}
