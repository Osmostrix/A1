// Ashish Naik
// COP 3330 Section 0002
// Fizz Buzz problem solver

// Import necessary java functions
import java.util.*;
import java.io.*;

// Create Public Class based on filename
public class FizzBuzz {
	
	//Create Static class for main function
	public static void main(String[] args) {
		
		// Create a "try" area for intaking information from input file
		try {
		
			// Create a new scanner to intake the parameters for each test case
			Scanner numbers = new Scanner(new File("Fizzbuzz.sample.in"));
			
			// Create three new variables: one for the first integer, one for the second, and one to count
			// Make the counting variable equal to the first integer
			int start = numbers.nextInt();
			int finish = numbers.nextInt();
			int mark = start;
			
			// Repeat the following process as long as the first and second number are not both equal to zero
			while ((start != 0) && (finish != 0)) {
			
				// As long as the counting variable is less than the second variable, repeat the following process
				while (mark <= finish) {
					
					// If the counting variable is both a multiple of 3 and 5, write FizzBuzz to screen
					// If it is only a multiple of 3, write Fizz to screen
					// If it is only a multiple of 5, write Buzz to screen
					// If it is neither a multiple of 3 or 5, simply write the integer to screen
					if ((mark % 3 == 0) && (mark % 5 ==0)) {
						System.out.println("FizzBuzz");
					}
					else if (mark % 3 == 0) {
							System.out.println("Fizz");
					}
					else if (mark % 5 == 0) {
							System.out.println("Buzz");
					}
					else {
						System.out.println("" +mark);
					}
					
					// After checking the current value of the counting variable, raise it by one
					mark = mark+1;
				}
				
				// After the first test case is complete, start a new test case
				// Intake new values for the first and second integers
				// Reset the counting variable to the value of the first integer
				System.out.println("");
				start = numbers.nextInt();
				finish = numbers.nextInt();
				mark = start;
				
			}
			
			// Close file when finished
			numbers.close();
			
			// Place a "catch" at the end of the "try" area
		}
		catch (FileNotFoundException ex) {}
	}

	
}