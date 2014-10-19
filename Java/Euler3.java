import java.util.Scanner;

class Euler3
{
    public static void main(String[] args)
    {
    long remaining=600851475143L,mod_value=0,highest=0,i=0;
    
    for (i = 1; i < remaining; i++)
 	{	
 		mod_value = remaining % i;
 		if (mod_value == 0)
 		{	
 			if (i > highest)
 				highest = i;
 			remaining = remaining / i; //remaining := remaining / i 
 			System.out.println("i equals: " + i + " remaining equals: " + remaining);
 		}
 	}
 	
 	System.out.println("The answer is: " + highest);
    }
}
    