/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.


Consider the following series: 1, 1, 2, 3, 4, 9, 8, 27, 16, 81, 32, 243, 64, 729, 128, 2187 …

This series is a mixture of 2 series – all the odd terms in this series form a geometric series and all the even terms form yet another geometric series. Write a program to find the Nth term in the series.

The value N in a positive integer that should be read from STDIN. The Nth term that is calculated by the program should be written to STDOUT. Other than value of n th term,no other character / string or message should be written to STDOUT. For example , if N=16, the 16th term in the series is 2187, so only value 2187 should be printed to STDOUT.

You can assume that N will not exceed 30. 

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = 30;
		int[] arr = new int[n];
		arr[0]=1;
		arr[1]=1;
		
		for(int i=2;i<30;i++)
		{
		    
		    if(i%2==0)
		    {
		        arr[i] = arr[i-2]+arr[i-2];
		    }
		    else{
		    arr[i] = arr[i-2]*3;
		    }
		}
		
// 		for(int i=0;i<30;i++)
// 		{
// 		    System.out.print(arr[i]+" , ");
// 		}
		System.out.println();
		System.out.println("enter the term you want to see");
		int term = sc.nextInt();
		
		if(term<=30)
		{
		    System.out.println(arr[term-1]);
		}
		
		else
		{
		    System.out.println("the term sould be below 30");
		}
		
		
	}
}
