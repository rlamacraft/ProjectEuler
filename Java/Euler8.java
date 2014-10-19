//import java.lang.String;

class Euler8
{
    public static void main(String[] args)
    {
    	String wholething = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
    	int temp=0,largest=0,test=0;
    	int[] EachDigit = new int[wholething.length()];
    	
    	for(int i=0; i < wholething.length(); i++) {
    		//System.out.println("wholething at each char = " + (wholething.charAt(i)));
    		test = wholething.charAt(1);
    		EachDigit[i] = (wholething.charAt(i)-48); //!!! for some reason 1's become 49 and 9's become 57
    		//System.out.println("Each digit[i] = " + EachDigit[i]);
    		}
    	for(int j=1; j < (wholething.length()-4); j++) { //996?
    		temp = ((EachDigit[j])*(EachDigit[j+1])*(EachDigit[j+2])*(EachDigit[j+3])*(EachDigit[j+4]));
    		//System.out.println("j = " + j + " temp = " + temp);
    		//System.out.println("EachDigit[" + j + "] = " + EachDigit[j]);
    		if (temp > largest)
    			largest = temp;
    	} //end j loop
    	
    	System.out.println("The answer is: " + largest);
    	//System.out.println("test = " + test);
    
    }
}
    	