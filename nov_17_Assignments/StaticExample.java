package nov_17_Assignments;

public class StaticExample {

	static int age;
	static String name;
	int add(int a, int b)
	{
		return(a+b);
	}
	static void display_details()
	{
		System.out.println("Example of static method");
	}
	public static void main(String[] args) 
	{
		StaticExample st = new StaticExample();
		
		//calling of non static method
			// called using class because of non static method
		System.out.println("Addition of a & b is" + st.add(4, 6));
		
		//calling of static method 
			// accessed without calling of class since static 
		age = 28;
		System.out.println("Age is :" + age);
		name = "Ivana Kimberly";
		System.out.println("Name is :" + name);
		display_details();
		
			}

}
