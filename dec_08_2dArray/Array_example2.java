package dec_08_2dArray;

public class Array_example2 {

	public static void main(String[] args) {
		 {
			 
		        int[][] arr = { { 1, 2}, { 3, 4}, {5,6} };
		        
		        System.out.println("Two Dimension Array Initilization");
		 
		        for (int i = 0; i < 3; i++) 
		        {
		            for (int j = 0; j < 2; j++) 
		            {
		                System.out.print(arr[i][j] + " "); // print numbers in array format and in new line
		            }
		 
		            System.out.println();
		        }
		    }
	}
}

