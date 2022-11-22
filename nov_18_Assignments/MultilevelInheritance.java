package nov_18_Assignments;

class Guest1
{
	public void display1()
	{
		System.out.println("Bizio Subscription Details are: ");
		System.out.println("Guest Account is for free");
	}
}
class Conference1 extends Guest1
{
	public void display2()
	{
		System.out.println("Conference account is for $140/year");
	}
}

class Basic extends Conference1
{
	public void display3()
	{
		System.out.println("Basic Account is for $360/year if upgrading directly to Basic");
		System.out.println("Basic Account is for $290/year if upgrading from Conference to Basic");
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		Basic obj1 = new Basic();
		obj1.display1();
		obj1.display2();
		obj1.display3();

	}

}
