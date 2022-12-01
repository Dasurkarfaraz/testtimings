package com.testtimings;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCount {
    int count;

    public int ScanForValue() throws IOException {
        if(! new File("C:\\Users\\faraz\\Desktop\\file.txt").exists())
            return 0;
        else{
            FileReader fr = new FileReader("C:\\Users\\faraz\\Desktop\\file.txt");
            Scanner scanFile = new Scanner(fr);
            String n =scanFile.nextLine();
            count = Integer.parseInt(n);
            scanFile.close();
        }
        return count;
    }

    public void increment() throws IOException {
        int newValue = ScanForValue();
        newValue++;
        System.out.println("ReportWithReponse//Data"+newValue+".csv");
        writeIntoFile(newValue);
    }

    public void writeIntoFile(int countNumber) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\faraz\\Desktop\\file.txt");
        String fin = String.valueOf(countNumber);
        fw.write(fin);
        fw.close();
    }
    public static void main(String[] args) throws IOException {
    	FileCount fd = new FileCount();
    	fd.increment();
    	
    }
}