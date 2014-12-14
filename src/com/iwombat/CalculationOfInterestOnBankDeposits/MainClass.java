package com.iwombat.CalculationOfInterestOnBankDeposits;

import java.io.IOException;
import java.util.List;

/**
 * Created by Marzieh on 12/12/2014.
 */
public class MainClass {
    public static void main( String[] args ) throws IllegalAccessException {
        ReadingAndParsingInputFile readParsfile = new ReadingAndParsingInputFile();
        DepositDocuments depositDocuments = readParsfile.readXML("C:/Users/Ermia/Desktop/Deposits.xml");
        ReflectionObject reflection = new ReflectionObject();
        List<Deposit> listDeposit = null;
        String outputString = "";
        PrintOutputFile printOutputFile = new PrintOutputFile();
        try {
            listDeposit = reflection.objectCreation(depositDocuments);
            for ( int i = 0 ; i < listDeposit.size() ; i++  ) {
                outputString = ""+listDeposit.get(i).getCustomerNumber()+"#"+listDeposit.get(i).getPayedInterest()+"\r\n";
                printOutputFile.writingToFile( outputString ,"C:/Users/Ermia/Desktop/result.txt" , i*50 );
            }
        }
        catch (IOException  e) {
            System.out.println("IOException accured");
            e.printStackTrace();
        }
        catch (MyException1 e1)
        {
            System.out.println("Deposit type is incorrect :"
                 + e1.getExceptionText());
            e1.printStackTrace();
        }
        catch (MyException2 e2)
        {
            System.out.println("Deposit balance is less than zero :"
                 + e2.getExceptionText());
            e2.printStackTrace();
        }
        catch (MyException3 e3)
        {
            System.out.println("Duration in days is zero or less than zero :"
                 + e3.getExceptionText());
            e3.printStackTrace();
        }
    }
}
