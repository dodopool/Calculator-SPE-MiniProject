package org.example;

public class Calculator
{
	Double computeSquareRoot(double inpX)
	{
                if(inpX < 0)
                {
                        System.out.println("Negative number, really? Exiting...");
			return null;
                }
                else
                {
                        System.out.print("The square root is: ");
                        Double res = Math.sqrt(inpX);
			System.out.println(res);
			return res;
                }
	}

	Integer computeFactorial(int inpX)
	{
		if(inpX < 0)
                {
                        System.out.println("Negative number, seriously? Exiting...");
                        return null; 
                }
                else
                {
                        Integer res = 1;
                        for(int i = 1; i <= inpX; i++)
                        {
                                res = res * i;
                        }
                        System.out.print("The factorial is: ");
                        System.out.println(res);
			return res; 
                }
	}

	Double computeNaturalLog(double inpX)
	{
		if(inpX < 0)
                {
                        System.out.println("Well, natural log of negative numbers is not defined!, Exiting...");
                	return null;
		}
                else if(inpX == 0.0)
                {
                        System.out.println("Natural log of 0 is not defined! Exiting...");
                	return null; 
		}
                else
                {
                        Double res = Math.log(inpX);
                        System.out.print("The natural log is: ");
                        System.out.println(res);
			return res; 
                }
	}

	Double computePower(double base, double power)
	{
		Double res = Math.pow(base, power);
		System.out.print("The result is: ");
                System.out.println(res);
		return res; 
	}
}
