import java.lang.Math;

public class Euler12 {
	public static void main(String args[]) {
		boolean complete = false;
		int counter = /*29*/0, result = 0;
		double tri = /*435*/0;
	
		while(complete==false) {
			counter++;
			tri += counter;
			result = FactorCounter(tri);
			if(result>500) {
				complete = true;
			} else {
				System.out.println("; "+tri + "," + result);
			}
		}
		System.out.print("Num of factors: "+result);
		System.out.println(" Answer: "+tri);
		
	}

	public static int FactorCounter(double input) {
		int numOfFactors = 0;
		double temp = 0;
		double sqrTri = Math.sqrt(input);
		
		if(Math.round(sqrTri)*Math.round(sqrTri)==input) {//sqrTri is an int
			numOfFactors += 1;
		}
		for(int i=1;i<Math.ceil(sqrTri);i++) {
			temp = input / i;
			//System.out.print("----" + temp + "," + Math.round(temp));
			if(temp == Math.round(temp)) { //division produces int
				numOfFactors += 2;
				//System.out.print(i + ",");
				//System.out.print(temp + ",");
			}	
		}
		return numOfFactors;
		/*if(numOfFactors>500) {
			return numOfFactors;
		} else {
			return 0;
		}*/	
	}
}

//NOT 63190