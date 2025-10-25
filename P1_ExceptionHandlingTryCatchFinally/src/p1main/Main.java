package p1main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Example - #1
//		Scanner s = new Scanner(System.in);
//		try {
//			System.out.print("Number: ");
//			int x = s.nextInt();
//			
//			System.out.println("Correct! " + x);
//		}catch(Exception e) {
//			System.out.println("Datatype error!");
//		} finally {
//			s.close();
//		}
		
//		Example - #2
//		String names[] = {"Sachie", "Batutilan"};
//		Scanner s = new Scanner(System.in);
//		
//		System.out.print("Index: ");
//		
//		int index = s.nextInt();
//		
//		System.out.println(names[index]);
		
		
//		## EXCEPTIONS ##
		
//		ArithmeticException
//		int x = 5/0;
		
//		InputMismatchException
//		Scanner s = new Scanner(System.in);
//		int x = s.nextInt();

//		NumberFormatException
//		String n = "Sachie";
//		int x = Integer.parseInt(n);
		
//		ArrayIndexOutOfBoundsException
//		String names[] = {"Sachie", "Batutilan", "Burnag", "Valentina"};
//		System.out.println(names[5]);
		
		
//		## HANDLE OF MULTIPLE CATCH ##
		
//		try {
//			
//			String names[] = {"Sachie", "Batutilan", "Burnag", "Valentina"};
//			
//			Scanner s = new Scanner(System.in);
//			
//			System.out.print("Number: ");
//			
//			int index = s.nextInt();
//			
//			System.out.println(names[index]);
//			
//			System.out.println("CORRECT!");
//			
//		}catch(InputMismatchException e) {
//			System.out.println("Only input integers");
//			
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("Array Out of Bounds");
//		}
		
		
//		HANDLE MULTIPLE EXCEPTION IN ONE CATCH
		
//		try {
//			
//			String names[] = {"Sachie", "Batutilan", "Burnag", "Valentina"};
//			
//			Scanner s = new Scanner(System.in);
//			
//			System.out.print("Number: ");
//			
//			int index = s.nextInt();
//			
//			System.out.println(names[index]);
//			
//			System.out.println("CORRECT!");
//			
//		}catch(ArrayIndexOutOfBoundsException | InputMismatchException e) {
//			System.out.println("Something is wrong");
//			
//		}
		
		
//		Handle leftover newline after nextInt()
//		Scanner s = new Scanner(System.in);
//		
//		System.out.print("Age: ");
//		int age = s.nextInt();
//		s.nextLine();
//		
//		System.out.print("Name: ");
//		String name = s.nextLine();
//		
//		System.out.println();
//		System.out.println(name);
//		System.out.println(age);
		
		
//		TUTORIAL CHALLENGE	
		
		Scanner s = new Scanner(System.in);
		int age = 0;
		boolean valid = false;
		
		do {
			try {
				System.out.print("Age: ");
				age = s.nextInt();
				valid = true;
				
				System.out.println();
				
				System.out.println("Your age is: " + age);
				System.out.println("Square: " + (age*age));
				break;
				
			} catch(InputMismatchException e) {
				s.nextLine();
				System.out.println("Only Input Integers!\n\n");

			}
			
		} while(!valid);
		
	}

}
