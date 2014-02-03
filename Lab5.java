import java.lang.*;
import java.util.*;
import static java.lang.Math.*;
import java.text.*;
import java.io.*;

public class Lab5 {

public static int boats;

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
    

    	Scanner scan = new Scanner( System.in );
    	scan.useLocale(new Locale("US"));	

    	int rad = scan.nextInt();// Rader
    	int kol = scan.nextInt();// Kolumner
    	
    	String[][] board = new String[rad][kol];
    	
    	
    	
    	for (int r=0; r<board.length; r++) {
    		String input = scan.next();
	    	if (input.length() != kol){
		    	System.out.println("Fel input!");
		    	r = r-1;
		    	continue;
	    	}
	    	for (int c=0; c<board[r].length; c++) {
		    	char tecken = input.charAt(c);
		    	board[r][c] = Character.toString(tecken);
		    }
		    
		}
		//System.out.println(board.length);
/* ------------ Kontrollera innehallet i two dim array -------------- */

		for (int r=0; r<board.length; r++) { // LODRATA BATAR			
			for (int c=0; c<board[r].length; c++) {

				if (board[r][c].equals("O")){ 
					try {
						int langd=0;
						while (board[r][c].equals("O")){
							langd++;
							c++;
							if (c==kol){
								break;
							}
						}
						
						if (langd > 1){
							boats++;
						}
					
					}
					
					catch (ArrayIndexOutOfBoundsException e) {
						continue;
					}
				}
				
			}
			
		}

		for (int c=0; c<kol; c++) { // VAGRATA BATAR			
			for (int r=0; r<board.length; r++) {
			//System.out.println(c);
				if (board[r][c].equals("O")){ 
					try {
						int langd=0;
						while (board[r][c].equals("O")){
							langd++;
							r++;
							if (r==rad){
								break;
							}
						}
						
						if (langd > 1){
							boats++;
						}

					}
					
					catch (ArrayIndexOutOfBoundsException e) {
						continue;
					}
				}	
			}	
		}
		System.out.println(boats);
	}    
}