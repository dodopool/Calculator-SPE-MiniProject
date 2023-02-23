package org.example;

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        System.out.println("Welcome to Scientific Calculator");
	System.out.println("What would you like to do?");
	System.out.println("1. Enter 1 to compute Square Root");
	System.out.println("2. Enter 2 to compute Factorial");
	System.out.println("3. Enter 3 to compute Natural Logarithm (base e)");
	System.out.println("4. Enter 4 to compute Power function");
	System.out.println("5. Enter 5 to exit the program");
	System.out.print("Enter your choice: ");
	Scanner inputReceiver = new Scanner(System.in);
	int choice = inputReceiver.nextInt();

	if(choice >= 5)
	{
		System.out.println("Exiting program...");
		System.exit(0);
	}
	else if(choice == 1)
	{
		System.out.print("Enter the number whose square root is to be calculated: ");
		double inpX = inputReceiver.nextDouble();
		if(inpX < 0)
		{
			System.out.println("Negative number, really? Exiting...");
			System.exit(1);
		}
		else
		{
			System.out.print("The square root is: ");
			System.out.println(Math.sqrt(inpX));
			System.exit(0);
		}
	}
	else if(choice == 2)
	{
		System.out.print("Enter the number of factorial is to be calculated: ");
		int inpX = inputReceiver.nextInt();
		if(inpX < 0)
		{
			System.out.println("Negative number, seriously? Exiting...");
			System.exit(1);
		}
		else
		{
			int res = 1;
			for(int i = 1; i <= inpX; i++)
			{
				res = res * i;
			}
			System.out.print("The factorial is: ");
			System.out.println(res);
			System.exit(0);
		}
	}
	else if(choice == 3)
	{
		System.out.print("Enter the number whose natural log is to be calculated: ");
		double inpX = inputReceiver.nextDouble();
		if(inpX < 0)
		{
			System.out.println("Well, natural log of negative numbers is not defined!, Exiting...");
			System.exit(1);
		}
		else if(inpX == 0.0)
		{
			System.out.println("Natural log of 0 is not defined! Exiting...");
			System.exit(1);
		}
		else
		{
			double res = Math.log(inpX);
			System.out.print("The natural log is: ");
			System.out.println(res);
			System.exit(0);
		}
	}
	else
	{
		System.out.print("Enter the base: ");
		double base = inputReceiver.nextDouble();
		System.out.print("Enter the power: ");
		double power = inputReceiver.nextDouble();
		double res = Math.pow(base, power);
		System.out.print("The result is: ");
		System.out.println(res);
		System.exit(0);
	}
    }
}
