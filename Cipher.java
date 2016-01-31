// Ashish Naik
// COP 3330 Section 0002
// Stringing Problem Solver

// Import necessary Java functions
import java.util.*;
import java.io.*;

// Create a public class based on the file name
public class Cipher {

	// Create a static class for the main function
	public static void main(String[] args) {
	
		// Create a "try" area to intake information from the input file
		try {
		
			// Create a new scanner to intake information from the input file
			Scanner letters = new Scanner(new File("Cipher.sample.in"));
			
			// Create an integer variable to store the number for the cipher
			int standard;
			
			
			// Create a string to store the original message
			String holder;
			
			// Create a variable to store the converted message
			char[] convert;
			
			// Create a variable to store each letter and convert it
			// Create a variable to redefine the letter based on it's value
			// User a counter to mark each test case
			char temp;
			int mark;
			int count = 1;
			
			while (letters.hasNext()) {
				
				// Define variables for the test case
				standard = letters.nextInt();
				holder = letters.nextLine();
				convert = holder.toCharArray();
			
				// Convert each letter within the message based on the "standard" value
				for (int i = 1; i<holder.length(); ++i) {
			
					// Use an integer variable to store the value of the letter
					temp = convert[i];
				
					// As long as the value falls within the range of letters, convert it
					if ((temp >= 65) && (temp <= 90)) {
						mark = temp;
						mark = standard+mark;
					
						// If the conversion leads outside the ranger of letters, bring it to the beggining again.
						if (mark > 90) {
							mark = mark-26;
						}
					
						// Replace the letter
						convert[i] = (char) (mark);
					
					}
				}
				
				// Display the new message
				System.out.printf("Case #%d:", count);
				System.out.println(convert);
				
				// Raise the counter for the next case
				count = count+1;
				
			}
		
			// Close file when finished
			letters.close();
			
			// Input a "catch" at the end of "try" area
		}
		catch (FileNotFoundException ex) {}
	
	
	
	}


}