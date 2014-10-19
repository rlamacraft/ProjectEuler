class Euler16
{
	public static void main(String[] args)
	{
		int stage_one=2,total=0,i,j,slength;
		String stage_two;
		char temp;
		
		for(i=0;i<1000;i++) {
			stage_one = stage_one * 2;
			System.out.println(stage_one);
		}
		System.out.println(stage_one);
		
		stage_two = Integer.toString(stage_one);
		
		slength = stage_two.length();
		for(j=0;j<slength;j++) {
			temp = stage_two.charAt(j);
			total = total + (temp-48);
		}
		
		System.out.println("Answer is " + total);
	}
}