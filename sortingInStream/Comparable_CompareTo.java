package sortingInStream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

class students
{
	String Sname;
	int Age;
	float R_no;
	String Address;
	
	public students(String Sname, int Age,float R_no, String Address )
	{
		this.Sname = Sname;
		this.Age = Age;
		this.R_no = R_no;
		this.Address = Address;
		
	}
	
	public void printDetails()
	{
		System.out.println("Student Name: " + Sname + "||" + " Student Age: " + Age + "||"+  " Student RollNo: " + R_no + "||" + " Student Address: " + Address);
	}
	
}
	//for name wise sorting
	class StudentNameComparator implements Comparator<students> 
	{
	@Override
	public int compare(students o1, students o2) 
	{
		return o1.Sname.compareTo(o2.Sname);
	}	
}
	//for age wise sorting
	class StudentAgeComparator implements Comparator<students> 
	{
	@Override
	public int compare(students o1, students o2) 
	{
		return o1.Age - o2.Age;
	}	
}
	//for address wise sorting
	class StudentAddressComparator implements Comparator<students> 
	{
	@Override
	public int compare(students o1, students o2) 
	{
		return o1.Address.compareTo(o2.Address);
	}	
}
	

public class Comparable_CompareTo {

	public static void main(String[] args) {
		List<students> Studs_List = new ArrayList<students>();
    	//productsList.add(new Product());  
		Studs_List.add(new students("Maria", 25, 001f, "Delhi"));  
		Studs_List.add(new students("Avira", 29, 003f, "Chennai"));  
		Studs_List.add(new students("Eva", 24, 002f, "Ahemedabad"));  
		Studs_List.add(new students("Zeenath", 30, 004f, "Punjab"));
		
		Stream<students> streamStudents = Studs_List.stream();
		streamStudents = Studs_List.stream(); 
		
		System.out.println("Name wise Sorting result: ");
		streamStudents.sorted(new StudentNameComparator()).forEachOrdered((d)->d.printDetails()); //used foreach ordered to iterate 
    	System.out.println("Age wise Sorting result:  ");
    	streamStudents = Studs_List.stream(); 
    	streamStudents.sorted(new StudentAgeComparator()).forEachOrdered((d)->d.printDetails());
    	streamStudents = Studs_List.stream();
    	System.out.println("Address wise Sorting result: ");
    	streamStudents.sorted(new StudentAddressComparator()).forEachOrdered((d)->d.printDetails());
	}

}
