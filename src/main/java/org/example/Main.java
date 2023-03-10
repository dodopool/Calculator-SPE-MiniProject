package org.example;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main
{
    private static final Logger logUtility = LogManager.getLogger(Main.class);

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

	Calculator calcObj = new Calculator();

	if(choice >= 5)
	{
		System.out.println("Exiting program...");
		System.exit(0);
	}
	else if(choice == 1)
	{
		System.out.print("Enter the number whose square root is to be calculated: ");
		double inpX = inputReceiver.nextDouble();
		logUtility.info("[SQUARE ROOT] - " + inpX);
		logUtility.info("[RESULT] - " + calcObj.computeSquareRoot(inpX));
	}
	else if(choice == 2)
	{
		System.out.print("Enter the number of factorial is to be calculated: ");
		int inpX = inputReceiver.nextInt();
		logUtility.info("[FACTORIAL] - " + inpX);
		logUtility.info("[RESULT] - " + calcObj.computeFactorial(inpX));
	}
	else if(choice == 3)
	{
		System.out.print("Enter the number whose natural log is to be calculated: ");
		double inpX = inputReceiver.nextDouble();
		logUtility.info("[NATURAL LOG] - " + inpX);
		logUtility.info("[RESULT] - " + calcObj.computeNaturalLog(inpX));
	}
	else
	{
		System.out.print("Enter the base: ");
		double base = inputReceiver.nextDouble();
		System.out.print("Enter the power: ");
		double power = inputReceiver.nextDouble();
		logUtility.info("[EXPONENTIATION] - " + base + "^" + power);
		logUtility.info("[RESULT] - " + calcObj.computePower(base, power));
	}
    }
}
