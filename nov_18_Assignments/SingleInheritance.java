package nov_18_Assignments;

class Guest 
{
	public void display1()
	{
		System.out.println("Bizio Subscription Details are: ");
		System.out.println("Guest Account is for free");
	}
}
class Conference extends Guest
{
	public void display2()
	{
		System.out.println("Conference account is for $140/year");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		Conference obj1 = new Conference();
		obj1.display1();
		obj1.display2();
	
	}

}
