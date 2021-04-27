package fileInput;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class CompanyLocker_DataWritten {

	public static void main(String[] args) throws IOException {
		

		
			
			FileWriter output=null;
		    String data = "This is the data in the output file"+ "Who are you"+ "Where are you";
		    
		    try {
		      // Step 1: Creates a Writer using FileWriter
		      output = new FileWriter("C://Users//cthakkar01//Desktop//Capstone//capstone//simpleLearn//");
		      
		      // Step 2: Writes string to the file
		      output.write(data);
		      System.out.println("Data is written to the file and file is close.");

		    }
		    catch (Exception e) {
		      e.getStackTrace();
		    }
		    finally{
		        // Step 3: Closes the writer
		        output.close();
		    }
		 }
		

	}


