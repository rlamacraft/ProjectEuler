public class Euler10 {
	public static void main(String args[]) {
		long total = 0;
		int counter = 0;
		
		for(int i = 2;i<2000000;i++) {
			if(CheckPrime(i)) { //if prime
				total = total + i; //add to total
				counter += 1;
				if(counter % 10000 == 0) 
					System.out.println(i);
			}
		}
		System.out.println(total);
	}
	
	
	public static boolean CheckPrime(int i) {
		for(int j = 2;j<i;j++) { //check all previous ints
			if(i % j == 0) { //if not prime
				return false;
			}
		} 
		return true; //if still running, must be prime
	}
}
			
						