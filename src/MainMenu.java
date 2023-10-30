/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	
		
		Scanner sc  = new Scanner(System.in);
		int i;
	
		String [] coffe1 = {"Espresso Coffe","Capaccino coffe","Latte Coffe"};
		
		
		String[] tea1 = {"Plain Tea","Assam Tea","Ginger Tea","Cardamom Tea","Masala Tea","Lemon Tea","Green Tea","Organic Darjeeling Tea"};
		
		
		String [] soups1 = {"Hot and Sour Soup","Veg Corn Soup","Tomato Soup","Spicy Tomato Soup"};
		
		String[] beverages1 = {"Hot Chocolate Drink","Badam Drink","Badam-Pista Drink"};
		
		System.out.println("Enter the first letter to select the main menu:");
        System.out.println("c - Coffee");
        System.out.println("t - Tea");
        System.out.println("s - Soups");
        System.out.println("b - Beverages");
		char ch = sc.next().charAt(0);
		
		System.out.println();
	   
		
		if(ch=='c'||ch=='C')
		{
		    System.out.println("Coffe");
		    System.out.println("Select a coffe from menu ");
		for( i =0;i<coffe1.length;i++)
		{
		    System.out.println((i+1)+" . "+coffe1[i]);
		}
		
		int n = sc.nextInt();
		if(n>0&&n<=coffe1.length)
		{
		    System.out.println("enjoy your "+coffe1[n-1]+" !");
		}
		
		else{
		    System.out.println("Invalid Input");
		}
		
		
		}
		
		
		else if(ch=='t'||ch=='T')
		{
		    System.out.println("Tea");
		    System.out.println("Select Tea from menu ");
		for( i =0;i<tea1.length;i++)
		{
		    System.out.println((i+1)+" . "+tea1[i]);
		}
		
		int n = sc.nextInt();
		if(n>0&&n<=tea1.length)
		{
		    System.out.println("enjoy your "+tea1[n-1]+" !");
		}
		else{
		    System.out.println("Invalid Input");
		}
		
		}
		
		else if(ch=='S'||ch=='s')
		{
		    System.out.println("Soups");
		    System.out.println("Select Soups from menu ");
		for( i =0;i<soups1.length;i++)
		{
		    System.out.println((i+1)+" . "+soups1[i]);
		}
		int n = sc.nextInt();
		if(n>0&&n<=soups1.length)
		{
		    System.out.println("enjoy your "+soups1[n-1]+" !");
		}
		
		}
		
		else if(ch=='b'||ch=='B')
		{
		    System.out.println("Beverages");
		    System.out.println("Select Beverages from menu ");
		for( i =0;i<beverages1.length;i++)
		{
		    System.out.println((i+1)+" . "+beverages1[i]);
		}
		int n = sc.nextInt();
		if(n>0&&n<=beverages1.length)
		{
		    System.out.println("enjoy your "+beverages1[n-1]+" !");
		}
		
		}
		
	
		else{
		    System.out.println("Invalid Input");
		}
	}
}
