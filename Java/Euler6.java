class Euler6
{
    public static void main(String[] args)
    {
    int temp=0,SquareTotal=0,ans=0,total=0;
    
    
		for(int SumSquares = 1; SumSquares < 101; SumSquares++){ 
			temp=(SumSquares*SumSquares);
			SquareTotal+=temp;
			total+=SumSquares;
			}
		if (total != 0)
			total=(total*total);
		else {
			System.out.println("Some issues with 0x0");
			}
		System.out.println("1*1 + 2*2 + 3*3 … + 10*10 = " + SquareTotal);
		System.out.println("(1+2+3 … 10)*(1+2+3 … 10) = " + total);
		ans = total - SquareTotal;
		System.out.println("Answer = " + ans);
    }
}
    	