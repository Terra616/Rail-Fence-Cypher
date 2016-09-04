package ie.gmit.dip;

public class Encryption {

	public static void createMatrix(String txt , int key , char[][] M){ // This method creates a matrix
		int step = (key - 1) * 2;
		for (int  i = 0 ; i < key ; i ++ ){
			for (int j = i ; j < txt.length(); j+=step){
				int pos2 = j + (step - i*2);
				M[i][j] = txt.charAt(j);
				if(pos2 < txt.length()){
					M[i][pos2] = txt.charAt(pos2);
				}
			}
		}
	}
	
	public static String generateEncryptedTxt(char[][] M, int x, int y){
		String result = "";
		for (int  i = 0 ; i < x ; i ++){
			for (int j = 0 ; j < y ; j ++){
				if(M[i][j]!='\0'){ // '\0' is the empty character
				result = result+M[i][j];
				}
			}
		}
		return result;
		
	}
	
	public static void displayMatrix(char[][] M, int x, int y){
		for (int  i = 0 ; i < x ; i ++){
			for (int j = 0 ; j < y ; j ++){
				if(M[i][j] == '\0'){
					System.out.print("-");

				}else{
				System.out.print(M[i][j]);
				}
			}
			System.out.println();
		}

	}
	
}
