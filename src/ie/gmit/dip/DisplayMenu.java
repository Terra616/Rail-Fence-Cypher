package ie.gmit.dip;

import java.util.Scanner;

public class DisplayMenu {

	
	public static int mainMenu(){
		// This method displays the main menu
		int choice;
		Scanner s = new Scanner(System.in);
		System.out.println("\n\n\n");
		System.out.println("------------------- Main Menu -------------------");
		System.out.println("Please select one of the following options:");
		System.out.println("0 - Encrypt text (direct input)");
		System.out.println("1 - Encrypt text (input from a file)");
		System.out.println("2 - Decrypt text (direct input)");
		System.out.println("3 - Decrypt text (input from a file)");
		System.out.println("4 - Quit the application");
		System.out.println("-------------------------------------------------");
		do{
		System.out.println("Please enter a valid number [0-4]");
		choice = s.nextInt();
		}while (choice < 0 || choice >4);
		
		return choice;

	}

	public static int encryptionMenu(){
		int choice;
		Scanner s = new Scanner(System.in);
		System.out.println("\n\n");
		System.out.println("------------------- Encryption Menu -------------------");
		System.out.println("Please select one of the following options:");
		System.out.println("0 - Display results on the screen");
		System.out.println("1 - Save results to a file");
		System.out.println("2 - Display the encryption matrix");
		System.out.println("3 - Return to the main Menu");
		System.out.println("---------------------------------------------------------");
		do{
		System.out.println("Please enter a valid number [0-3]");
		choice = s.nextInt();
		}while (choice < 0 || choice >3);
		
		return choice;
	}
	
	public static int encryptionFileMenu(){
		int choice;
		Scanner s = new Scanner(System.in);
		System.out.println("\n\n");
		System.out.println("------------------- Encryption Menu -------------------");
		System.out.println("Please select one of the following options:");
		System.out.println("0 - Display results on the screen");
		System.out.println("1 - Save results to a file");
		System.out.println("2 - Return to the main Menu");
		System.out.println("---------------------------------------------------------");
		do{
		System.out.println("Please enter a valid number [0-2]");
		choice = s.nextInt();
		}while (choice < 0 || choice >2);
		
		return choice;
	}
	
	public static int decryptionMenu(){
		int choice;
		Scanner s = new Scanner(System.in);
		System.out.println("\n\n");
		System.out.println("------------------- Decryption Menu -------------------");
		System.out.println("Please select one of the following options:");
		System.out.println("0 - Display results on the screen");
		System.out.println("1 - Save results to a file");
		System.out.println("2 - Display the decryption matrix");
		System.out.println("3 - Return to the main Menu");
		System.out.println("---------------------------------------------------------");
		do{
		System.out.println("Please enter a valid number [0-3]");
		choice = s.nextInt();
		}while (choice < 0 || choice >3);
		
		return choice;
	}
	
	public static int decryptionFileMenu(){
		int choice;
		Scanner s = new Scanner(System.in);
		System.out.println("\n\n");
		System.out.println("------------------- Decryption Menu -------------------");
		System.out.println("Please select one of the following options:");
		System.out.println("0 - Display results on the screen");
		System.out.println("1 - Save results to a file");
		System.out.println("2 - Return to the main Menu");
		System.out.println("---------------------------------------------------------");
		do{
		System.out.println("Please enter a valid number [0-2]");
		choice = s.nextInt();
		}while (choice < 0 || choice >2);
		
		return choice;
	}
	
	
}
