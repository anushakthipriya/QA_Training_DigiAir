package nov_14_CondStatements;

import java.util.Scanner;

public class Assignment1
{
	public static void main(String[] args) {
        int count, i;
        float totalMarks = 0, percentage, average;
        Scanner scanner;
        scanner = new Scanner(System.in);
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter a Student Name: ");  
		String str= sc.nextLine(); //reads string   
        System.out.print("Student Name is : "+ '\n' + str + '\n' ); 
        
        System.out.println("Enter Number of Subject");
        count = scanner.nextInt();
 
        System.out.println("Enter Marks of " + count + " Subject");
        for (i = 0; i < count; i++) {
            totalMarks += scanner.nextInt();
        }
        System.out.println("Total Marks : " + totalMarks);
        percentage = (totalMarks / (count * 100)) * 100;
 
        /* Printing grade of a student using switch case statement */
        switch ((int) percentage / 10) {
        case 9:
            System.out.println("Grade : A+");
            break;
        case 8:
        case 7:
            System.out.println("Grade : A");
            break;
        case 6:
            System.out.println("Grade : B");
            break;
        case 5:
            System.out.println("Grade : C");
            break;
        default:
            System.out.println("Grade : D");
            break;
        }
    }
}
