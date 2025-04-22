package pack;

import java.util.Scanner;

public class StudentResult {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter marks for Subject 1:");
		int subject1=scanner.nextInt();
		
		System.out.print("Enter marks for Subject 2:");
		int subject2=scanner.nextInt();
		
		System.out.print("Enter marks for Subject 3:");
		int subject3=scanner.nextInt();
		
		int totalMarks=subject1+subject2+subject3;
		double percentage = (totalMarks/3.0);
		
		System.out.println("Percentage:" +percentage+ "%");
		if (percentage > 85) {
			System.out.println("Result: Distinction");
			
		} else {
			System.out.println("Result: First Class");
		}
         scanner.close();
	}

}
