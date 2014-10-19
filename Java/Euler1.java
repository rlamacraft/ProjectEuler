import java.util.Scanner;

class Euler1
{
    public static void main(String[] args)
    {
    long i=0,j=0,k=0,three_total=0,five_total=0,fifteen_total=0;
    
    while (i < 334)
    	{
    	three_total += (i*3);
		i++;
    	}
    
    while (j < 200)
    	{
    	five_total += (j*5);
    	j++;
    	}	
    
	
    while (k < 67)
    	{
    	fifteen_total += (k*15);
    	k++;
    	}
    
    System.out.println("Three's section: " + three_total);
    System.out.println("Five's section: " + five_total);	
   	System.out.println("Fifteen's section: " + fifteen_total);
    	
    	
    }
}