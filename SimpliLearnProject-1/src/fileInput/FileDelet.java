package fileInput;

import java.io.File;
import java.io.IOException;

public class FileDelet {

	public static void main(String[] args) throws IOException {
		File file = new File("C://Users//cthakkar01//Desktop//Capstone//capstone//JavaProject");
		
 boolean b = file.delete();
       if(b==true)
       {
		System.out.println("File found !!");
       }
       else
       {
		System.out.println("File not found");
       
       }  
}
	}


