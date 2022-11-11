package com.AddressBook.CSV;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import javax.swing.filechooser.FileFilter;
import com.opencsv.CSVWriter;


public class AddressBook {

	public void writeAddressBook() throws IOException {
		
		  FileWriter outputfile = new FileWriter("C:\\\\Users\\\\mesha\\\\OneDrive\\\\Desktop\\\\Day-27\\\\Day-27AddressBook\\\\src\\\\main\\\\java\\\\com\\\\AddressBook\\\\CSV\\\\FileWritten.txt");
	       
	         // create CSVWriter object filewriter object as parameter
	         CSVWriter writer = new CSVWriter(outputfile);
	       
	         // create a List which contains String array
	         ArrayList<String[]> addrsBook=new ArrayList<String[]>();
	 		addrsBook.add( new String[] {"FirstName","LastName","City","State","Zip","Email"});
	 		addrsBook.add( new String[] {"Shadab","Hussain","Mumbai","Maharastra","851443","me.shadab@gmailcom"});
	 		addrsBook.add( new String[] {"Tony","Stark","pune","Maharashtra","242333","Tony@gmail.com"});
	 		addrsBook.add( new String[] {"Farhan","Hussain","Saran","Bihar","841301","farhan@live.in"});
	 		writer.writeAll(addrsBook);
	         
	         writer.writeAll(addrsBook);
	       
//	         // closing writer connection
	     writer.close();

	}
	

	public void readAddressBook() throws IOException, Exception {
	
		  FileReader filereader = new FileReader("C:\\Users\\mesha\\OneDrive\\Desktop\\Day-27\\Day-27AddressBook\\src\\main\\java\\com\\AddressBook\\CSV\\FileWritten.txt");

	        // create csvReader object and skip first Line
	        CSVReader csvReader = new CSVReaderBuilder(filereader).withSkipLines(1).build();
	        List<String[]> allData = csvReader.readAll();

	        // print Data
	        for (String[] row : allData) {
	            for (String cell : row) {
	                System.out.print(cell + "\t");
	            }
	            System.out.println();
	        }
	        System.out.println("======================================================================");

	}
	
	public static void main(String[] args) throws Exception {	
		AddressBook obj=new AddressBook();
		obj.writeAddressBook();
		obj.readAddressBook();
		
		
	}

}
