package dec_08_2dArray;

public class Array_example1 {

	public static void main(String[] args) {
		 // create a 2d array
        int[][] x = {
            {1, 2, 3}, 
            {4, 5, 6, 9}, 
            {7, 8}, 
        };
      
        // calculate the length of each row
        System.out.println("Length of row 1: " + x[0].length);
        System.out.println("Length of row 2: " + x[1].length);
        System.out.println("Length of row 3: " + x[2].length);
    }
}
