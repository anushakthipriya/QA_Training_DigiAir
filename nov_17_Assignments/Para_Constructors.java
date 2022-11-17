package nov_17_Assignments;

public class Para_Constructors {
	int student_id;
	String student_name;

	Para_Constructors(int Student_Id, String Student_Name)
	{
		this.student_id = Student_Id;
		this.student_name = Student_Name;
	}
	
	void display()
	{
		System.out.println("Student_Id :" + student_id + '\n' + "Student_Name" + student_name);
	}
	public static void main(String[] args) 
	{
		System.out.println("Student Details are: ");
		Para_Constructors obj1 = new Para_Constructors(001, "Ivana");
		Para_Constructors obj2 = new Para_Constructors(002, "Ryan");
		obj1.display();
		obj2.display();


	}

}
