package nov_19_Assignments;

abstract class Bizioapps //abstract class
{
	abstract void products(); // abstract method
	
	public void product1() // non abstract method
	{
		System.out.println("Product 1 is Bizio Meet");
	}
}

class Apps extends Bizioapps    // inheriting a subclass product from superclass Bizioapps
{
	public void products()
	{
		System.out.println("Product 2 is Bizio Drive"); //here subclass provides implementation for abstract method products
	}
}
public class Abstract_example {

	public static void main(String[] args) {
		Apps app = new Apps();
		app.product1();
		app.products();

	}

}
