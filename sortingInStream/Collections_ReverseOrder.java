package sortingInStream;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_ReverseOrder 
{

	public static void main(String[] args) 
	{
		ArrayList<String> list_val = new ArrayList<String>();
		
		list_val.add("Zeebra");
		list_val.add("Elephant");
		list_val.add("Animal");
		
		Collections.sort(list_val);
		System.out.println("Sorte Array List in Ascending order: " + '\n' + list_val);
		
		//to reverse order i.e., descending
		Collections.sort(list_val, Collections.reverseOrder());
		System.out.println("Sorted Array List in Descending order: " + '\n' + list_val);
		
		//to replace a value in list
		Collections.replaceAll(list_val, "Animal","Crocodile" );
		System.out.println("List after replacing Animal by replace all method: " + '\n' +list_val);
		
			}

}
