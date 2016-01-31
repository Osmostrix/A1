// Ashish Naik
// COP 3330 Section 0002
// Stringing Problem Solver

// Import necessary Java functions
import java.util.*;
import java.io.*;

// Create public class based on file name
public class Stringing {

	// Create static class for main function
	public static void main(String[] args) {
		
		// Create "try" area for dealing with file information
		try {
		
			// Create new scanner for intaking information from input file
			Scanner info = new Scanner(new File("Stringing.sample.in"));
			
			
			// Create three new variables: a number of strings, an array for the strings, and a command number
			int total = info.nextInt();
			String[] stuff = new String[total+1];
			int command;
			
			// Fill the array with the strings from the input file
			for (int i = 0; i <= total-1; ++i) {
				stuff[i] = info.next();
			}
			
			// Create three more variables for use in the following commands
			int element1;
			int element2;
			int element3;
			
			// Perform indicated commands as follows until none remain
			while (info.hasNext()) {
			
				// Intake command integer
				command = info.nextInt();
				
				// For command "1"
				if (command == 1) {
				
					// Intake list number for string to be used
					element1 = info.nextInt();
					
					// Display length of the string chosen
					System.out.println(""+stuff[element1].length());
				}
				
				// For command "2"
				if (command == 2) {
					
					// Intake the list number of the string to be used
					// Intake the starting border
					// Intake the stopping border
					element1 = info.nextInt();
					element2 = info.nextInt();
					element3 = info.nextInt();
					
					// Display all letters between the given borders of this string
					System.out.println(""+stuff[element1].substring(element2, element3));
				
				}
				
				// For command "3"
				if (command == 3) {
				
					// Intake the string length to be searched for
					// Start a counter at 0
					element1 = info.nextInt();
					element2 = 0;
					
					// For each string from the list of matching length, raise the counter
					for (int i = 0; i <= total-1; ++i) {
						
						if (stuff[i].length() == element1) {
							element2 = element2 + 1;
						}
						
					}
					
					// Display the total of matching strings
					System.out.println(""+element2);
				
				}
				
				// For command "4"
				if (command == 4) {
				
					// Intake the list number of the beggining string
					// Intake the list number of the ending string
					// Create a new, blank "String" variable to store the concatenation
					element1 = info.nextInt();
					element2 = info.nextInt();
					String holder = "";
					
					// Combine the list elements between, and including, the beggining and ending string
					for (int i = element1; i <= element2; ++i) {
						holder = holder+stuff[i];
					}
					
					// Display the resulting concatenation
					System.out.println(""+holder);
				
				}
			
			}
			
			test();
			
			// Close file when finished
			info.close();
		
			// Put "catch" at the end of "try"
		}
		catch (FileNotFoundException ex) {}
	
	
	
	
	
	}
	
	public static void test () {
	
	}


}