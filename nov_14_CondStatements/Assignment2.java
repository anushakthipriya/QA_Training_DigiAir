package nov_14_CondStatements;

public class Assignment2 
{
	void Employee_Name(String emp_name)
	{
		System.out.println("Employee name is:" + emp_name);
	}
	void Employee_Address(String emp_add)
	{
		System.out.println("Employee Address is:" + emp_add);
	}
	void Employee_Id(double emp_Id)
	{
		System.out.println("Employee Id is:" + emp_Id);
	}
	void Employee_Salary(int emp_salary)
	{
		System.out.println("Employee Salary is:" + emp_salary);
	}
		
    public static void main(String[] args) 
    {
		Assignment2 emp = new Assignment2();
        emp.Employee_Name("Anu");
        emp.Employee_Id(001);
        emp.Employee_Address("Chennai");
        emp.Employee_Salary(25000);
        
        System.out.println("Designation Categories w.r.to Salary are as follows:");
        int salary = 1; 
        switch(salary)
        {
            case 1:
            	System.out.println("If Salary is less than or equal to 25000 : The designation of an employee is Junior Engineer");
            	// break;
           case 2:
        	    System.out.println("If Salary is less than or equal to 35000: The designation of an employee is Test Engineer");
            	// break;
           case 3:
            System.out.println("If Salary is less than or equal to 45000: The designation of an employee is Senior QA Engineer");
            	// break;
        }
    }
}
