package javaChallenge2;

import java.util.Scanner;

//Java Challenge (2/20)
//
//Given a non-negative integer x, compute and return the square root of x.
//
//Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.
//
//Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.
//
// 
//
//Example 1:
//
//Input: x = 4
//Output: 2
//Example 2:
//
//Input: x = 8
//Output: 2
//Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.
public class SquareRoot
{
	public int squareRoot(int number)
	
	{
		//formula ===> Y(n+1) = ((number/Y(n)) + Y(n))/2 (number is given number)
		
		// eg1. number = 4 then y=4/2=>2
		// eg2. number =8 then y=8/2=>4.0
		// intialize the value of y (in iteration first value of y(squaeroot number) should be number/2) 
		double y = number/2;
		
		// eg1. temp = 2
		// eg2. temp=4.0
		
		double temp = y;
		
		//eg1.y=((4/2)+2)/2 ==>4/2===>2
		//eg2. y=((8/4)+4)/2 ===>6/2===>3.0
		y=((number/temp)+temp)/2;
		
		//eg1.temp-y (2-2=0) condition fail not entered into loop
		// eg2.=================================================
		//Iteration1 ==> temp-y (4.0-3.0=1.0) condition true loop will be activated
		//Iteration2 ===>temp-y(3-2.833) condition true loop will be activated
		//Iteration3 conditon pass
		//Iteration4 conditon pass
		//Iteration5 ===>temp-y(2.82-2.82)
		
		while((temp-y)!=0)
		{
			//eg2 .(1) temp =3.0;
			//     (2) temp=2.833
			//	   (3) temp = 2.82
			temp = y;
			
			//(1)y=((8/3)+3)/2 ===> 2.833
			//(2)y=2.82
			//(3) y=2.82
			y=((number/temp)+temp)/2;
			
		}
		//typecasting convert double to integer to truncate decimal values
		
		int square = (int)y;
				
		return square;
		
	}
		
		
		
		
	
	public static void main(String[] args) 
	{
		System.out.println("Enter the number to find square root of it");
		System.out.println("==========================================");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		SquareRoot root = new SquareRoot();
		//root.squareRoot(number);
		System.out.println("===========================================");
		System.out.println("Squareroot Value of the given number is  ");
		System.out.println("===========================================");
		System.out.println(root.squareRoot(number));
		sc.close();
		
	}

}
