package array_ListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListArrayMethods {

	public static void main(String[] args) {
		
		//First arrayList
		List<String> obj1 = new ArrayList<String>();
		obj1.add("Two Wheeler");
		obj1.add("Four Wheeler");
		obj1.add("Heavy Vehicle");
		
		System.out.println("Before adding element on 0th index" + obj1);
		
		obj1.add(0, "Light Vehicle");
		
		System.out.println("After adding element on 0th index");
		Iterator veh1 = obj1.iterator();
		while(veh1.hasNext())
		{
			System.out.println(veh1.next());
		}
		//te remove an element on particular index
		obj1.remove(1);
		System.out.println("After removing an element on 1st index" + '\n');
				
		//second arrayList
		List<String> obj2 = new ArrayList<String>();
		obj2.add("BMW");
		obj2.add("Skoda");
		obj2.add("MG Harrier");
		obj2.add("Heavy Vehicle");
		
		System.out.println("Second array list values are: ");
		
		Iterator veh2 = obj1.iterator();
		while(veh2.hasNext())
		{
			System.out.println(veh2.next());
		}
		
		//to check contains 
		boolean output = obj2.contains("Hello");
		System.out.println(output);
		
		/**to clear array values
		 obj1.clear();
		 System.out.println(obj1 + ": after clearing obj1");
		 **/
		
		 //to set array value at particular index
		 obj2.set(3, "TATA Cars");
		 System.out.println("Second array list values after changing 3rd index value: ");
		 Iterator veh3 = obj2.iterator();
			while(veh3.hasNext())
			{
				System.out.println(veh3.next());
			}
			
			//addAll 
			obj1.addAll(obj2);
			System.out.println("After appending 2 arraylist");
			 Iterator veh4 = obj1.iterator();
				while(veh4.hasNext())
				{
					System.out.println(veh4.next());
				}
						
			//get an element value
			String str1 = obj1.get(1);
			System.out.println("returning element of index value 1 is:" + " " + str1);
			
			//to check is arraylist empty or not
			boolean result = obj1.isEmpty();
			System.out.println("Value of isempty() : " + result);
			
			//to check size of arrayList
			System.out.println("Size of arrayList of obj1 is :" + obj1.size());
			System.out.println("Size of arrayList of obj2 is :" + obj2.size());
			

	}

}
