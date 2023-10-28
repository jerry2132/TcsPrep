/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

******************************************************************************
We want to estimate the cost of painting a property. Interior wall painting cost is Rs.18 per sq.ft. and exterior wall painting cost is Rs.12 per sq.ft.

Take input as
1. Number of Interior walls
2. Number of Exterior walls
3. Surface Area of each Interior 4. Wall in units of square feet
Surface Area of each Exterior Wall in units of square feet

If a user enters zero  as the number of walls then skip Surface area values as User may don’t  want to paint that wall.

Calculate and display the total cost of painting the property
Example 1:
6
3
12.3
15.2
12.3
15.2
12.3
15.2
10.10
10.10
10.00
Total estimated Cost : 1847.4 INR
Note: Follow in input and output format as given in above example



*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Interior walls");
		int n = sc.nextInt();
		System.out.println("Exterior Walls");
		int m = sc.nextInt();
		float sumArr = 0;
		float sumArr1 = 0;
		
		float[] arr = new float[n];
		float[] arr1 = new float[m];
		
		if(m>=0&&n>=0)
		{
		for(int i=0; i<n;i++)
		{
		    arr[i] = sc.nextFloat();
		    sumArr+=arr[i]; 
		   
		}
		
		sumArr = sumArr*18;
		
			for(int i=0; i<m;i++)
		{
		    arr1[i] = sc.nextFloat();
		    sumArr1+=arr1[i];
		}
		sumArr1 = sumArr1*12;
		
		System.out.println("Total Cost  "+(sumArr1+sumArr));
		}
		else
		{
		    System.out.println("Invalid input");
		}
		
		
		
	}
}
