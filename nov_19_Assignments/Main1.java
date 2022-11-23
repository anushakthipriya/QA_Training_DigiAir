package nov_19_Assignments;

interface Product 
{
	  void getName(String name);
	}

	// class implements interface
	class ProductName implements Product {

	  // implementation of abstract method
	  public void getName(String name) {
	    System.out.println("The Product Name is: " + name);
	    System.out.println("And it contains the following " + '\n' + "TheBizio Apps" + " Bizio Center & Support");
	  }
	}

	class Main1 {
	  public static void main(String[] args) {
		  ProductName name = new ProductName();
		  name.getName("TheBizio");
	  }
	}
