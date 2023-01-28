package array_ListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> obj1 = new ArrayList<String>();
		obj1.add("Guest Account");
		obj1.add("Conference Account");
		obj1.add("Basic Account");
		
		System.out.println("The types of account TheBizio holds are" + obj1);
		
		obj1.add(0, "Non Bizio User");
		System.out.println("And it also includes" + '\n' + obj1);
		
		// traversing list through iterator
		Iterator itr = obj1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		List<String> obj2 = new ArrayList<String>();
		obj2.add("Bizio Meet");
		obj2.add("Bizio Drive");
		obj2.add("Bizio TODO");
		
		System.out.println("The main products of Guest Account are");
		
		// traversing list through for each loop
		
		for(String products:obj2)
		{
		    System.out.println(products + " "); 
		}
		
		obj2.add(3, "Bizio C-Suite");
		
		System.out.println("The main products of Baisc Account are");
		
		// traversing list through for loop 
		
		for(int i=0 ; i <obj2.size(); i++)
		{
			if(i < obj2.size()-1)
			 System.out.print(obj2.get(i)+'\n');
			else 
			 System.out.print(obj2.get(i));			
		}
			
	}

}