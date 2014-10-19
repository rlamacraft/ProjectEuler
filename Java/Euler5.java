class Euler5
{
    public static void main(String[] args)
    {
    	int counter=0,ans=0;
    	boolean foundanswer=false;
    	
    	int testingvalue=20;
    	
    	for(int nums = 1; nums < 1000000000; nums++){ 
    		if (foundanswer==false) {
				//for each value to 100000 (estimated max value)
				counter=0;
				for(int OneToTwenty = 1; OneToTwenty < (testingvalue+1); OneToTwenty++){ //for each value from 1 to 20
					if ((nums % OneToTwenty) == 0) //nums MOD OneToTwenty checks a given number (nums) is divisible by each value under 21
						counter++; //increment counter if true
				} //end OneToTwenty for loop
				if (counter == testingvalue) {
						foundanswer=true;
						ans = nums;
				} //ends counter if
			} //end foundanswer if
			//else {
    	} //ends num for
    	
    	System.out.println("Answer is: " + ans);
    	
   	} //ends main
} //ends class 
