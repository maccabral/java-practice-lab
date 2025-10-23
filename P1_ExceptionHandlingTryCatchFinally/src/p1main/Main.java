package p1main;

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
		String names[] = {"Sachie", "Batutilan"};
		Scanner s = new Scanner(System.in);
		
		System.out.print("Index: ");
		
		int index = s.nextInt();
		
		System.out.println(names[index]);
		
		

	}

}
