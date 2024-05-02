package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//exception handling
		
		// exception = > unexpected events that will stop your program 
	Scanner scanner = new Scanner(System.in);
	
	//Any code that is consider  dangerous we can surround  with a 
	// = = = = = = = = > try block 
		try {
			
			
			System.out.println("Enter a whole number to divide  ");
			int x = scanner.nextInt();
			
			System.out.println("Enter a whole number to divide  ");
			int y = scanner.nextInt();
			
			int z = x/y;
			
			System.out.println("Result: " + z );
			// If we encounter any exceptions 
		} catch(ArithmeticException e) {
			System.out.println("You cant divide by zero! IDIOOT!3");
		}catch(InputMismatchException e) {
			System.out.println("Please enter a number OMFG!!!");
		}catch (Exception e) {
			System.out.println("Somethin went wrong");
		}
		// If we have open scanner , files to close or anything else to do 
		finally {
			scanner.close();
		}
		
		
		

	}

}
