package com.iwombat.CalculationOfInterestOnBankDeposits;

import java.io.*;
/**
 * Created by Marzieh on 12/10/2014.
 * In this class we receive information from arguments of writingToFile method and then
 * write to output file by utilizing RandomAccessFile object.
 */
public class PrintOutputFile {
    public void writingToFile(String data, String filePath, int position) throws IOException
    {
        RandomAccessFile file = new RandomAccessFile(filePath, "rw");
        file.seek(position);
        file.write(data.getBytes());
        file.close();

    }
}
