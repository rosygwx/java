package bucky;

import java.util.Scanner;

public class ScannerTwo{
	public static void main (String args[]) {
		double fnum, snum, answer;
		Scanner bucky = new Scanner(System.in);
		System.out.println("Please enter the first number:");
		fnum = bucky.nextDouble();
		System.out.println("Please enter the second number:");
		snum = bucky.nextDouble();
		answer = fnum+snum;
		System.out.println("The sum of the above number is:"+answer);
		System.out.println("Thank you for watching!");
	}
}