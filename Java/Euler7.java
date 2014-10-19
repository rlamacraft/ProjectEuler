class Euler7
{
    public static void main(String[] args)
    {
    	boolean isitprime=true;
    	int current=2,foundprimes=1,everynum=2;
    	
    	while (foundprimes < 10001) { //finds the first 6 primes
    		isitprime=true;
    		everynum++;
    		for(int previousnums=2; previousnums < /*(everynum-1)*/ (current); previousnums++) {
    			if((everynum % (previousnums)) == 0) {
    				//System.out.println(everynum + " is it not prime"));	
    				isitprime=false;
    			}
    		}
    		if (isitprime==true) {
    			foundprimes++;
    			System.out.println(everynum + " is prime and has replaced " + current + " as the current variable");
    			current = everynum;
    		}
    		else {
    			System.out.println(everynum + " is not prime"); 
    		}
    		
    		System.out.println("Now found: " + foundprimes);
    		
		} //end foundprimes while loop   	
		
		System.out.println("The answer is: " + current);
		
	}
}	