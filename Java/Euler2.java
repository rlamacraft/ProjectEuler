import java.util.Scanner;

class Euler2
{
    public static void main(String[] args)
    {
    int prev1=0,prev2=1,current=0,total=0;
    
    while (current < 4000000)
    	{
    	current = prev1 + prev2;
    	if (current % 2 == 0)
    		total += current; //total is incremented by current
    	prev1 = prev2;
    	prev2 = current;
    	}
    	
    System.out.println(total);	
    	
    }
}
    
    
    
    