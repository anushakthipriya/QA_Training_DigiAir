package dec_05_Assignments;

public class StarPattern
{
  public static void main(String args[])
  {
      int n = 5;  // number of rows
       
      for(int i=0;i<n;i++) //outer Loop
      {
          for(int k=i;k<n;k++)
          System.out.print("  ");
 
           
          for(int j=0;j<=2*i;j++) //j = 2*i to print odd no. of stars
          {
           
            System.out.print("* ");  // to print '*' for each row
          }
          System.out.println(); // for new line 
      }
  }
}  
 
