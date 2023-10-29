/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.
Problem Statement

There are total n number of Monkeys sitting on the branches of a huge Tree. As travelers offer Bananas and Peanuts, the Monkeys jump down the Tree. If every Monkey can eat k Bananas and j Peanuts. If total m number of Bananas and p number of Peanuts are offered by travelers, calculate how many Monkeys remain on the Tree after some of them jumped down to eat.
At a time one Monkeys gets down and finishes eating and go to the other side of the road. The Monkey who climbed down does not climb up again after eating until the other Monkeys finish eating.
Monkey can either eat k Bananas or j Peanuts. If for last Monkey there are less than k Bananas left on the ground or less than j Peanuts left on the ground, only that Monkey can eat Bananas(<k) along with the Peanuts(<j).
Write code to take inputs as n, m, p, k, j and return  the number of Monkeys left on the Tree.
    Where, n= Total no of Monkeys
        k= Number of eatable Bananas by Single Monkey (Monkey that jumped down last may get less than k Bananas)
        j = Number of eatable Peanuts by single Monkey(Monkey that jumped down last may get less than j Peanuts)
        m = Total number of Bananas
        p  = Total number of Peanuts
Remember that the Monkeys always eat Bananas and Peanuts, so there is no possibility of k and j having a value zero

Example 1:
Input Values    
20
2
3
12
12

Output Values
Number of  Monkeys left on the tree:10
Note: Kindly follow  the order of inputs as n,k,j,m,p as given in the above example. And output must include  the same format  as in above example(Number of Monkeys left on the Tree:)
For any wrong input display INVALID INPUT


*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter total monkeys");
		int n = sc.nextInt();
		System.out.println("eatable bananas");
		int k = sc.nextInt();
		System.out.println("eatable peanuts");
		int j = sc.nextInt();
		System.out.println("total bananas");
		int m = sc.nextInt();
		System.out.println("total peanuts");
		int p = sc.nextInt();
		int ateBanana = 0;
		int atePeanut = 0;
		
		if(k<0||n<0||j<0||m<0||p<0)
		{
		    System.out.println("invalid");
		}
		
		else{
		    
		    if(k>0)
		    {
		        atePeanut = p/j;
		        p = p%j;
		    }
		    if(j>0)
		    {
		        ateBanana = m/k;
		        m= m%k;
		    }
		    
		    n = n-ateBanana-atePeanut;
		    
		    if(m!=0||p!=0)
		    {
		        n= n-1;
		    }
		    System.out.println("Monkeys left"+n);
		    
		}
		
		
	}
}
