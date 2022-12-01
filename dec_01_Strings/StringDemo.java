package dec_01_Strings;

public class StringDemo {

	public static void main(String[] args) {
	String a = "Lets Learn Java Strings";
	String b = "Demo";
	String c = "Demo";
	
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	
	//using new keyword
	String a1 = new String("HelloWorld");
	String b1 = new String("HelloWorld");
	System.out.println(a1);
	System.out.println(b1);

	if (b==c) // will be equal as it is created using string literals
	{
		System.out.println("Strings b & c are equal");
	}
	else
	{
		System.out.println("Strings b & c are not equal");
	}
	if (a1==b1) // wont be equal as it is created using new keyword 
	{
		System.out.println("Strings a1 & b1 are equal");
	}
	else
	{
		System.out.println("Strings a1 & b1 are not equal");
	}
	}

}
