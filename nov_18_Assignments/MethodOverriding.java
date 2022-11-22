package nov_18_Assignments;

class Demo
{
	public void calc()
	{
		int a = 5;
		int b = 10;
		System.out.println("Sum of a & b is:" + (a+b));
	}
}

class calc1 extends Demo
{
	public void calc()
	{
		int a = 10;
		int b = 20;
		System.out.println("Sum of a & b is:" + (a+b));
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		
		// Execute the below commented code for method overriding 
		/**
		 calc1 obj1 = new calc1();
		 
		obj1.calc();
		**/
		
		// this is to display both class's value 
		
		Demo obj1 = new Demo();
		obj1.calc();
		
		Demo obj2 = new calc1();
		obj2.calc();
	}
}
