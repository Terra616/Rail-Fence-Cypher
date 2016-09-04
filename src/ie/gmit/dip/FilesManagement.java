package ie.gmit.dip;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FilesManagement {
	
	public static FileInputStream openFile(String fileName){ // This method opens a file if it exists, otherwise it returns null
		FileInputStream result;
		
		try {
			result = new FileInputStream(fileName);
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			return  null;
		}
		
		return result;
	}
	
	public static void saveToFile(String fileName, String txt){ // This method saves the string txt into the file(filename)
		try {
			FileOutputStream file = new FileOutputStream(fileName);
			
	       for (int i = 0 ; i < txt.length(); i++) {
	    	   char c = txt.charAt(i);
	    	   file.write(c);
	    	   }
	        file.close();		
	        
		} catch (IOException e) {
			System.out.println("Unable to save to file : " +fileName);
		}
	}
	

}
