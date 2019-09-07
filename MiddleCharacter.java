package pendinghomework;

import java.util.Scanner;

public class MiddleCharacter {

	public static void main(String[] args) {
		
		
		Scanner medium = new Scanner(System.in);
		System.out.println("Input a string: ");
		String str = medium.nextLine();
		System.out.println("the middle character in the string: "+ middle(str)+"\n");
		

	}
     
	public static String middle(String str) {
		
		int postion;
		int lenght;
		if (str.length() % 2 == 0) {
			
			postion = str.length() / 2 - 1;
			lenght = 2;
			
			}else {
				
				postion = str.length() / 2;
				lenght = 1;
				
			}
		           
		      return str .substring(postion, postion + lenght);
	}
}
