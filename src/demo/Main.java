package demo;

import java.util.Scanner;

public class Main {
	//Addition
	public int addition(int n1,int n2) {
		int sum = n1 + n2;
		return sum;
	}
	//Multiplication
	public int multiplication(int n1,int n2) {
		int mult = n1 * n2;
		return mult;
	}
	
	public int subtraction(int n1,int n2)
	{
		int result=n1-n2;
		return result;
	}
	public int division(int n1,int n2)
	{
		int result=n1/n2;
		return result;
	}
	public static void main(String[] args) 
	{
		Main obj=new Main();
		int choice,num1,num2;
		Scanner in =new Scanner(System.in);
		System.out.println("Enter 1 for addition \n Enter 2 for Subtraction \n+ Enter 3 for Division \n Enter 4 for mutiplication");
		in.nextInt(choice);
		System.out.println("Enter 2 Numbers");
		in.nextInt(num1);
		in.nextInt(num2);

	if (obj.validateInput(num1,num2))
	{
		switch(choice) {
			case 1:
				
				
				obj.addition(num1,num2);
				
			case 2:

				obj.subtraction(num1, num2);
				
			case 3:

				obj.division(num1,num2);
				
			case 4:

				obj.multiplication(num1,num2);
				
				
	}
		}
	else {System.out.println("Invalid input");}
	}
	

}
