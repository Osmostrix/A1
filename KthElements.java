// Ashish Naik
// COP 3330 Section 002
// Kth Element problem solver

// Input necessary Java functions
import java.util.*;
import java.io.*;

// Create public class based on filename
public class KthElements {

	// Create static class for main function
	public static void main(String[] args) {
	
		// Create a "try" area for intaking information from the input files
		try {
			
			// Create a new scanner to intake the information from the file
			Scanner numbers = new Scanner(new File("KthElements.sample.in"));
			
			// Create three new variables: the number of elements in the array, the array for the elements, and the kth number
			int cardinal = 0;
			int[] stuff = new int[100];
			int display = 0;
			
			// Intake the number of values for the current test case
			cardinal = numbers.nextInt();
			
			// Set up repeating code to end when "cardinal" equals 0
			while (cardinal != 0) {
			
				// Use "cardinal" value to fill the array
				for (int i = 1; i <= cardinal; ++i) {
					stuff[i] = numbers.nextInt();
			
				}
			
				// Intake the value for the kth element
				display = numbers.nextInt();
				
				// Use kth element value to display kth elements from array
				for (int i = 1; i<=cardinal; ++i) {
					
					// For each kth value, display to screen
					if (i % display == 0) {
						System.out.printf("" +stuff[i]);
						
						// For each value displayed before the last value, place a comma and space
						if ((cardinal-i) >= display)
							System.out.printf(", ");
					}
			
				}
				
				// Start a new line at the end of each test case
				System.out.println("");
				
				// Scan the new cardinal number for the new test case
				cardinal = numbers.nextInt();
				
			}
			
			// Close file when finished
			numbers.close();
		
			// Set a catch at the end of the "try" area
		}
		catch (FileNotFoundException ex) {}
	
	}






}