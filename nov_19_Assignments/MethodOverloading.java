package nov_19_Assignments;

public class MethodOverloading 
{
	public void add(int a , int b)
	{
        System.out.println("sum of a & b is : " + (a+b));
        }

	public void add(int a , int b , int c)
	{
	System.out.println("sum of a, b & c is : " + (a+b+c));
        }

public static void main(String args[])
{
	MethodOverloading obj1 = new MethodOverloading();
	obj1.add(10 , 2);
	obj1.add(10, 2 , 3);
}
}


