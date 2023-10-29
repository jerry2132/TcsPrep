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
		System.out.println("Hello World");
		
		Scanner sc = new Scanner(System.in);
		
	    String str = sc.nextLine();
	    int n = sc.nextInt();
	   // System.out.println(str.length());
	    
	   // String substr = str.substring(0,5);
	    
	   // System.out.println(str);
	   // System.out.println(substr);
	   
	   for(int i=0;i<n;i++)
	   {
	       String substr = sc.next();
	       boolean result = checkSubString(str, substr);
	       
	       if(result==true)
	       {
	           System.out.println("1");
	       }
	       else{
	           System.out.println("0");
	       }
	   }
	}
	
	public static boolean checkSubString(String str, String substr)
	{
	    
	    if(substr.length()>str.length())
	    {
	        return false;
	    }
	    else{
	        
	        for(int i=0;i<str.length()-substr.length()+1;i++)
	        {
	            if(str.charAt(i)==substr.charAt(0))
	            {
	                String temp = str.substring(i,i+substr.length());
	                
	                if(temp.equals(substr))
	                {
	                    return true;
	                }
	                
	            }
	        }
	    }
	    
	    return false;
}
	
}
