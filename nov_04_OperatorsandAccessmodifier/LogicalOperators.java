package nov_04_OperatorsandAccessmodifier;

public class LogicalOperators {

	public static void main(String[] args) {
		 int a = 40;
	        System.out.println (a < 10 & a < 20);  //should return false
	        System.out.println (a < 10 || a < 20);  //should return false
	        System.out.println (!(a < 10 & a < 20)); //should return true

	}

}
