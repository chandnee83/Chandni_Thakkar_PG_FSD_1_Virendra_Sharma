package fileInput;

import java.io.File;
import java.io.IOException;

public class CompanyLockers_optionTwo {

	public static void main(String[] args) {

		
			try {
				File file = new File("C://Users//cthakkar01//Desktop//Capstone//capstone//simpleLearn");
			
			
				if (file.createNewFile()) {  
	                System.out.println("New File is created!");  
	            } else {                   
	                if(file.exists())
	                {
	                    System.out.println("File already exists.");	
	                    System.out.println("File path:" + file.getAbsolutePath());
	                    System.out.println("File name:  " + file.getName());
	                    System.out.println("File class:  " + file.getClass());
	                    System.out.println("File parent:  " + file.getParent());  //give the parent folder name
	                    System.out.println("File space allocated:  " + file.getUsableSpace());
	                    System.out.println("File length: " + file.length());
	                    System.out.println("File list:   " + file.list());	                    
	                }
	              //--------------Delete the file code below-------------//
	                boolean b = file.delete();
	                if(b==true)
	                {
	                	System.out.println("File deleted !!");
	                }
	                else
	                {
	                	System.out.println("File not deleted");
	                
	                
	                }
	      
	            }  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        }  	  
	   }
	


	 

	}


