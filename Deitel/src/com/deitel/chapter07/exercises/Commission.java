// Exercise 7.10: Commission
// This class will record a salesperson's salary for the week into an array
// based upon the dollar sales that person did.
package com.deitel.chapter07.exercises;

import java.util.Scanner;

public class Commission {

	public int salary[] = new int[9];
	
	public void calculateSalary(int sales) {
		
		int tempSalary = (int) (200 + (sales * .09));
		
		System.out.println(tempSalary);
		
		if ( tempSalary >= 200 && tempSalary <= 290)
			salary[0] = salary[0] + 1;
		else if ( tempSalary >= 300 && tempSalary <= 399)
			salary[1] = salary[1] + 1;
		else if ( tempSalary >= 400 && tempSalary <= 499)
			salary[2] = salary[2] + 1;
		else if ( tempSalary >= 500 && tempSalary <= 599)
			salary[3] = salary[3] + 1;
		else if ( tempSalary >= 600 && tempSalary <= 699)
			salary[4] = salary[4] + 1;
		else if ( tempSalary >= 700 && tempSalary <= 799)
			salary[5] = salary[5] + 1;
		else if ( tempSalary >= 800 && tempSalary <= 899)
			salary[6] = salary[6] + 1;
		else if ( tempSalary >= 900 && tempSalary <= 999)
			salary[7] = salary[7] + 1;
		else if ( tempSalary >= 1000)
			salary[8] = salary[8] + 1;
		
	} // end method calculateSalary
	
	
	public void inputSales() {
		
		int sales;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the sales for the associate (-1 to exit): ");
		sales = input.nextInt();
		
		while (sales != -1) {
			
			calculateSalary(sales);
			System.out.print("Enter the sales for the associate (-1 to exit): ");
			
			sales = input.nextInt();
			
		} // end while loop
		
		displaySalary();
		
	} // end method inputSales
	
	
	public void displaySalary() {
		
		System.out.printf("%11s\t%20s\n", "Salary Range", "Salesperson Count");
		
		for ( int counter = 0; counter < salary.length; counter++) {
			
			// output range label
			if (counter == 8)
				System.out.printf("%14s", "$1000 and over");
			else
				System.out.printf("$%3d-%3d", 
						(200 + (counter * 100)), (200 + (counter * 100 + 99)));
			
			System.out.printf("\t\t%5d", salary[counter]);
			
			System.out.println();
		}
	}
	
} // end class Commission
