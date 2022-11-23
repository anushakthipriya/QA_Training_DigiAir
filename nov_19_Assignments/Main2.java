package nov_19_Assignments;

 interface sum
{
	 void add(int a, int b);
}

class math implements sum
{
	 public void add(int a, int b)
	 {
	System.out.println("The addition of a & b is: " + (a+b));
}
}
class Main2
{
	public static void main(String[] args)
	{
	math m1 = new math();
	m1.add(10, 20);
	}
}
