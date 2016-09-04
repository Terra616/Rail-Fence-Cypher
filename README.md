I. Description
-----------------

This project implements the encryption and decryption functions (Rail Fence Cypher).

II. File list
-----------------
Decryption.java          Class that contains all the decryption methods
DisplayMenu.java           Class that contains all the methods for displaying the user menus
Encryption.java          Class that contains all the encryption methods 
FilesManagement.java       Class that contains all the methods required for reading and saving into files
Runner.java                Class that contains the main method for running the application

III. Design
--------------
A. Encryption

Contains three static methods:

1. createMatrix : this method generates the encryption matrix. It require the string to encrypt, the encryption key and the matrix to be filled in.

2. generateEncryptedTxt: this method takes as input the encryption matrix and generate the encrypted text.

3. displayMatrix: this method displays the encryption matrix.

B. Decryption

Contains three static methods:

1. regenerateMatrix : this method generates the decryption matrix from an encrypted text. It require the string of encrypted text, the decryption key and the matrix to be filled in.

2. generateOriginalTxt: this method takes as input the decryption matrix and generate the original text.

3. displayMatrix: this method displays the decryption matrix.

C. FileManagement

Contains two static methods:

1. openFile : this methods allows to open a file and verify if it exists.

2. saveToFile: this method saves a string given as parameter into a file also given as parameter.

D. DisplayMenu

Contains 5 methods for displaying multiple menus for the user.




IV. Execution
--------------
After running the program, the user will see the main menu as follows:

------------------- Main Menu -------------------
Please select one of the following options:
0 - Encrypt text (direct input)
1 - Encrypt text (input from a file)
2 - Decrypt text (direct input)
3 - Decrypt text (input from a file)
4 - Quit the application
-------------------------------------------------
Please enter a valid number [0-4]

The user has to give a valid number from 0 to 4.

Option 0: Encrypt text (direct input)
	The user will be asked to enter a text to encrypt and an encryption key.
	After execution of the encryption, the user will have to option to display results on screen, save results to a file, display the encryption matrix or return to the main menu. These options are shown via the following menu:
------------------- Encryption Menu -------------------
Please select one of the following options:
0 - Display results on the screen
1 - Save results to a file
2 - Display the encryption matrix
3 - Return to the main Menu
---------------------------------------------------------
Please enter a valid number [0-3]

Option 1: Encrypt text (input from a file)
	The user will be asked to provide a valid file name and encryption key. Once a file is open correctly, it will be encrypted line by line. 
	After execution of the encryption, the user will have to option to display results on screen, save results to a file or return to the main menu. These options are shown via the following menu:
------------------- Encryption Menu -------------------
Please select one of the following options:
0 - Display results on the screen
1 - Save results to a file
2 - Return to the main Menu
---------------------------------------------------------
Please enter a valid number [0-2]

Option 2: Decrypt text (direct input) ” similar to option 0

Option 3: Decrypt text (input from a file) ” similar to option 1

Option 4: permits to quit the application.
	