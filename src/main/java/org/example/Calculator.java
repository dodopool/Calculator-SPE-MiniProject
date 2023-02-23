package org.example;

public class Calculator
{
	void computeSquareRoot(double inpX)
	{
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

	void computeFactorial(int inpX)
	{
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

	void computeNaturalLog(double inpX)
	{
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

	void computePower(double base, double power)
	{
		double res = Math.pow(base, power);
		System.out.print("The result is: ");
                System.out.println(res);
                System.exit(0);
	}
}
