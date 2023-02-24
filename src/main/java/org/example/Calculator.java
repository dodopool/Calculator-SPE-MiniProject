package org.example;

public class Calculator
{
	Double computeSquareRoot(Double inpX)
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

	Integer computeFactorial(Integer inpX)
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

	Double computeNaturalLog(Double inpX)
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

	Double computePower(Double base, Double power)
	{
		Double res = Math.pow(base, power);
		if(Double.isNaN(res))
		{
			System.out.println("Error, cannot compute power");
			return null;
		}
		else
		{
			System.out.print("The result is: ");
			System.out.println(res);
			return res; 
		}
	}
}
