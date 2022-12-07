package dec_05_Assignments;

import java.util.Scanner;

public class Palindrom_Example {

	public static void main(String[] args) {
		String str , reversedstr = "";
		 Scanner in = new Scanner(System.in);   
	      System.out.println("Enter a string to check if it is a palindrome");  
	      str = in.nextLine(); 
	      
		int strlength = str.length();
		
		for(int i=(strlength-1); i>=0; i--)
		{
			reversedstr = reversedstr + str.charAt(i);
		}
		if(str.equals(reversedstr))
		{
			System.out.println("Entered string is palindrome");
		}
			else
			{
				System.out.println("Entered string is not palindrome");	
		}
	}

}
