import java.text.DecimalFormat;

class Euler9
{
	public static void main(String[] args)
	{
		double ans=0,k=0;
		DecimalFormat f = new DecimalFormat("0.0#");
		
		for(int i = 50; i < 501; i++) {
			for(int j = 50; j < 501; j++) {
				k = (i*i) + (j*j); //a² + b² = 
				k = Math.sqrt(k); //c²
				if (k == Math.floor(k)) { //if k is not a decimal value
					if ((i + j + k) == 1000) { //if they sum to exactly 1000
						ans = (i*j*k);
						System.out.println(f.format(ans)); //output their multiple
					}
				}
			} //end j for
		} //end i for
	}
}