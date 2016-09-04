package ie.gmit.dip;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Runner {
	public static void main(String[] args) throws Exception {
		int choiceMainMenu = DisplayMenu.mainMenu();

		do{		
		switch (choiceMainMenu){
		case 0:// The user wants to enter a text manually
				encryptDirectInput();
				choiceMainMenu = DisplayMenu.mainMenu();
				break;
		case 1: // The user wants to use a file as input
				encryptFromFile();
				choiceMainMenu = DisplayMenu.mainMenu();
				break ;
		case 2: // The user wants to enter a text manually
				decryptDirectInput();
				choiceMainMenu = DisplayMenu.mainMenu();
				break;
		case 3: // The user wants to use a file as input
				decryptFromFile();
				choiceMainMenu = DisplayMenu.mainMenu();
				break;
		case 4: //  Quit the application
				break;
		}
		}while (choiceMainMenu!=4);
		quit();
	}

	public static void encryptDirectInput(){
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter the text you want to encrypt: ");
		String str = s.nextLine();
		
		System.out.println("Please enter the encryption key: ");
		int key = s.nextInt();
		
		String txt = str.toUpperCase();
		char[][] M = new char[key][txt.length()];
		
		Encryption.createMatrix( txt ,  key , M);
		String encypredTxt = Encryption.generateEncryptedTxt(M,  key, txt.length());

		int choice = DisplayMenu.encryptionMenu();

		do{
		
		switch(choice){
		case 0: // Display result to screen
				System.out.println(encypredTxt);
				pressAnyKey();
				choice = DisplayMenu.encryptionMenu();
				break;
		case 1: // Save result to file
				saveToFile(encypredTxt);
				pressAnyKey();
				choice = DisplayMenu.encryptionMenu();
				break;
		case 2: // Display the Matrix
				Encryption.displayMatrix(M, key, txt.length());
				pressAnyKey();
				choice = DisplayMenu.encryptionMenu();
				break;
		case 3: // Return to main menu
				break;
		}
		}while(choice != 3);	
		
	}
	

	public static void encryptFromFile(){
		Scanner s = new Scanner(System.in);
		String fn=null;
		String fullText = "";
		FileInputStream fis;
		do{
			System.out.println("Please provide the file name: ");
			fn = s.next();
			fis = FilesManagement.openFile(fn);
		}while(fis==null);
				
		System.out.println("Please enter the encryption key: ");
		int key = s.nextInt();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(fn));
			String line=br.readLine();
			while (line!= null) {
				String txt = line.toUpperCase();
				char[][] M = new char[key][txt.length()];	
				Encryption.createMatrix( txt ,  key , M);
				String encypredTxt = Encryption.generateEncryptedTxt(M,  key, txt.length());
				if (fullText.length()==0){
					fullText = encypredTxt;
				}else
				{
					fullText = fullText +"\n"+ encypredTxt;
				}
				line=br.readLine();
			}
		} catch ( Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		int choice = DisplayMenu.encryptionFileMenu();

		do{
		
		switch(choice){
		case 0: // Display result to screen
				System.out.println(fullText);
				pressAnyKey();
				choice = DisplayMenu.encryptionFileMenu();
				break;
		case 1: // Save to file
				saveToFile(fullText);
				pressAnyKey();
				choice = DisplayMenu.encryptionFileMenu();
				break;
		case 2: // Return to main menu
				break;
		}
		}while(choice != 2);
		
	}
	

	
	public static void saveToFile(String txt){
		Scanner s = new Scanner(System.in);
		String fn ;
		System.out.println("Please enter a file name: ");
		fn = s.next();
		FilesManagement.saveToFile(fn, txt);
		
	}
	
	public static void decryptDirectInput(){
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter the text you want to decrypt: ");
		String str = s.nextLine();
		
		System.out.println("Please enter the encryption key: ");
		int key = s.nextInt();
		
		String txt = str.toUpperCase();
		char[][] M = new char[key][txt.length()];
		
		Decryption.regenerateMatrix( txt ,  key , M);
		String decypredTxt = Decryption.generateOriginalTxt(M,  key, txt.length());

		int choice = DisplayMenu.decryptionMenu();

		do{
		
		switch(choice){
		case 0: // Display result on th screen
				System.out.println(decypredTxt);
				pressAnyKey();
				choice = DisplayMenu.decryptionMenu();
				break;
		case 1: // Save result to file
				saveToFile(decypredTxt);
				pressAnyKey();
				choice = DisplayMenu.decryptionMenu();
				break;
		case 2: // Display the matrix
				Decryption.displayMatrix(M, key, txt.length());
				pressAnyKey();
				choice = DisplayMenu.decryptionMenu();
				break;
		case 3: // Return to main menu
				break;
		}
		}while(choice != 3);
		
	}


	
	public static void decryptFromFile(){
		Scanner s = new Scanner(System.in);
		String fn=null;
		String fullText = "";
		FileInputStream test;
		do{
			System.out.println("Please provide the file name: ");
			fn = s.next();
			test = FilesManagement.openFile(fn);
		}while(test==null);
		
		System.out.println("Please enter the decryption key: ");
		int key = s.nextInt();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(fn));
			String line;
			while ((line = br.readLine()) != null) {
				String txt = line.toUpperCase();
				char[][] M = new char[key][txt.length()];	
				Decryption.regenerateMatrix( txt ,  key , M);
				String decypredTxt = Decryption.generateOriginalTxt(M,  key, txt.length());
				if (fullText.length()==0){
					fullText = decypredTxt;
				}else
				{
					fullText = fullText +"\n"+ decypredTxt;
				}
			}
		} catch ( Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		int choice = DisplayMenu.decryptionFileMenu();

		do{
		
		switch(choice){
		case 0: // Display result to screen
				System.out.println(fullText);
				pressAnyKey();
				choice = DisplayMenu.decryptionFileMenu();
				break;
		case 1: // Save result to file
				saveToFile(fullText);
				pressAnyKey();
				choice = DisplayMenu.decryptionFileMenu();
				break;
		case 2: // Return to main menu
				break;
		}
		}while(choice != 2);
		
		
	}
	public static void quit(){
		System.out.println("BYE!");
	}

	public static void pressAnyKey(){
		System.out.println("\nPress any key to continue!");
		try {
	        System.in.read();
	    } catch (IOException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	        // This method waits until the user presses any key on the keyboard
	        // This solution was found on stackoverflow.com
	    }
	}
}
