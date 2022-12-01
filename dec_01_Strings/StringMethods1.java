package dec_01_Strings;

public class StringMethods1 {

	public static void main(String[] args) 
	{
		String s1 = "Hello World!";
		String s2 = "To Learn Strings in Java  ";
		String s3 = "Hello World example!";
		String s4 = "example";
		
		// to get length of a string
		int len = s1.length();
		System.out.println("String S1's Length is :" + len);
		
		// to get particular index value of an array
		System.out.println(s1.charAt(4));
		
		// to join two strings 
		String val = s1.concat(s2);
		System.out.println("Two strings can be joined using concat and the value is :" + val);
		
		// to compare strings
		boolean val1 = s1.equals(s3);
		System.out.println("The boolean value when String s1 is compared to s3 is :" + val1);
		
		boolean val2 = s1.equals(s2);
		System.out.println("The boolean value when String s1 is compared to s2 is :" + val2);
		
		// to determine whether a substring is a part of the main String or not - will return boolean value
		System.out.println(s1.contains(s2)); // false 
		System.out.println(s3.contains(s4)); // true
		
		// to find first occurrence of the character in a string
		System.out.println("First index value of o in String s1 is: " + s1.indexOf('o')); 
		
		// to find last occurrence of the character in a string
		System.out.println("Last index value of o in String s1 is: " +s1.lastIndexOf('o'));
		
		// to reverse a string
		String s5 = "howtoreverseastring";
		StringBuffer sb = new StringBuffer(s5);
		System.out.println("Reversed value of String s3 is :" + sb.reverse());
		
	
	}

}
