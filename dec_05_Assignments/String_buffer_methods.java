package dec_05_Assignments;

public class String_buffer_methods {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Java ");
		
		// append 
		sb.append('\n' + "Learn string buffer");
		System.out.println(sb);
		
		// insert - will insert string in the mentioned position
		sb.insert(3, " world of programs");
		System.out.println(sb);

		//replace - will replace string with mentioned string and position of start and end indexes
		sb.replace(1,3, "HAI");
		System.out.println(sb);
		
		// Trimtosize - capacity size will change to its efficiency
		StringBuffer sb1 = new StringBuffer("Welcome to the world of Java Programming");
		System.out.println("String is:" + sb1);
		int length = sb1.length();
		int capacity = sb1.capacity();
		System.out.println("Length after trim:" +length + '\n' + "Capacity after trim: " + capacity);
		sb1.trimToSize();
		length = sb1.length();
		capacity = sb1.capacity();
		System.out.println("Length after trim:" +length + '\n' + "Capacity after trim: " + capacity);
		
		// substring
		StringBuffer sb2 = new StringBuffer("Bizio Meet Contains many apps");
		System.out.println("String contains:" + sb2);
		System.out.println("Substring starts from: " + sb2.substring(5));
		
		// subsequence
		
		System.out.println("String after giving substring index value: " + sb2.subSequence(6, 10));
	}

}
