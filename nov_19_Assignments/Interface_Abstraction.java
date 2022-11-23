package nov_19_Assignments;

interface Accounts
{
	void acc_type1();
	void acc_type2();
	void acc_type3();
}

abstract class Demo implements Accounts
{
	public void acc_type3()
	{
		System.out.println("Basic Account - of price $360/year");
	}
}

class Demo1 extends Demo
{
	public void acc_type1()
	{
		System.out.println("TheBizio App's price range deatils of different plans: ");
		System.out.println("Guest Account - FREE");
	}
	public void acc_type2()
	{
		System.out.println("Conference Account - of price $190/year");
	}
}

public class Interface_Abstraction {

	public static void main(String[] args) {
		Accounts acc = new Demo1();
		acc.acc_type1();
		acc.acc_type2();
		acc.acc_type3();

	}

}
