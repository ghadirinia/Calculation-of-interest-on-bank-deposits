package com.iwombat.CalculationOfInterestOnBankDeposits;

/**
 * Created by Marzieh on 12/10/2014.
 * In ReflectionObject class we have a ArrayList from Deposit class objects. In objectCreation method argument
 * we receive an object from DepositDocuments class; later on, we use reflection and
 * then get and set fields of deposit objects. Exceptions myException1, myException2, myException3 handle in this
 * method when checking fields' value of each customer's information.
 * After ward, objects of subclasses of Deposit superclass create and down type casting implement by invoking
 * downCastingDeposit() method; later, CalculatePayedInterest() invoked and payed interest calculate for each
 * deposit; then, Deposit object add to a List.
 * Finally, List of Deposit object sorted and returned.
 */


import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReflectionObject {

    private ArrayList<Deposit> depositList = new ArrayList<Deposit>();
    public List<Deposit> objectCreation(DepositDocuments depositDocuments) throws MyException1,MyException2,MyException3
    {
        Deposits ListItem;
        Deposit deposit;
        Class cls;
        Field[] fields;
        try {

            for (int j = 0; j < depositDocuments.getItemDocumentList().size(); j++) {
                ListItem = depositDocuments.getItemDocumentList().get(j);
                deposit = new Deposit();
                cls = deposit.getClass();
                fields = cls.getDeclaredFields();
                fields[0].setAccessible(true);
                fields[0].set(deposit, ListItem.getCustomerNumber());
                fields[1].setAccessible(true);
                if ( !ListItem.getDepositType().equals("Qarz") && !ListItem.getDepositType().equals("LongTerm") && !ListItem.getDepositType().equals("ShortTerm")) {
                    throw new MyException1(ListItem.getDepositType());
                }
                fields[1].set(deposit, ListItem.getDepositType());
                fields[2].setAccessible(true);
                if (ListItem.getDepositBalance().signum() < 0) {
                    throw new MyException2(ListItem.getDepositBalance());
                }
                fields[2].set(deposit, ListItem.getDepositBalance());
                fields[3].setAccessible(true);
                if (ListItem.getDurationInDays() < 0 || ListItem.getDurationInDays() == 0) {
                    throw new MyException3(ListItem.getDurationInDays());
                }
                fields[3].set(deposit, ListItem.getDurationInDays());

                if (ListItem.getDepositType().equals("Qarz")) {
                    Qarz qarz = new Qarz();
                    qarz.downCastingDeposit(deposit);
                    qarz.CalculatePayedInterest();
                    deposit = qarz;
                    //((Qarz)deposit).CalculatePayedInterest();
                } else if (ListItem.getDepositType().equals("LongTerm"))
                {
                    LongTerm longTerm = new LongTerm();
                    longTerm.downCastingDeposit(deposit);
                    longTerm.CalculatePayedInterest();
                    deposit = longTerm;
                } else
                {
                    if (ListItem.getDepositType().equals("ShortTerm")) {
                        ShortTerm shortTerm = new ShortTerm();
                        shortTerm.downCastingDeposit(deposit);
                        shortTerm.CalculatePayedInterest();
                        deposit = shortTerm;

                    }
                }
                depositList.add(deposit);
            }//end of for
        }catch(IllegalAccessException e)
        {
            System.out.println("IllegalAccessException accure");
            e.printStackTrace();
        }
        Collections.sort(depositList);
        return depositList;
    }//end of method
}//end of class
