package nov_17_Assignments;

 // access instance variable using this 

public class This_example {
	int x;
	int y;
	
	This_example(int x, int y)
	{
		this.x = x + x;
		this.y = y + y;
	}
	
	void result()
	{
		System.out.println("Value of x is:" + x + '\n'+  "and" + '\n' + "Value of y is:" + y);
	}
	public static void main(String[] args) {
		This_example example = new This_example(10,20);
		example.result();
			}

}
