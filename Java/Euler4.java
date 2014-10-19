//Integer.toString(i)
//import java.util.Scanner;

class Euler4
{
    public static void main(String[] args)
    {
    	int iNum=0,CurrentHighest=0,size=0;
    	String sNum="";
    	char[] SNumSlices = new char[10];
    	
    	//begin
    	for(int first = 999; first > 0; first--){ 
    		for (int second = 999; second > 0; second--) 
    		{
    			iNum = first * second;
    			sNum = "" + iNum;
    			size = sNum.length();
    			while (size < 6) {
    				sNum = sNum + " ";
    				size = sNum.length();
    			}
    			
    			SNumSlices[1]=sNum.charAt(0);
    			SNumSlices[2]=sNum.charAt(1);
    			SNumSlices[3]=sNum.charAt(2);
    			SNumSlices[4]=sNum.charAt(3);
    			SNumSlices[5]=sNum.charAt(4);
    			SNumSlices[6]=sNum.charAt(5);
    			if (iNum > 100000) { //if its a 6-figure number
    				if (SNumSlices[1] == SNumSlices[6] && SNumSlices[2] == SNumSlices[5] && SNumSlices[3] == SNumSlices[4]) {
						if (iNum > CurrentHighest) 
							CurrentHighest=iNum;
						}
					}
				else if (iNum < 100000 && iNum > 10000) { //if its a 5-figure number
					if (SNumSlices[1] == SNumSlices[5] && SNumSlices[2] == SNumSlices[4]) {
						if (iNum > CurrentHighest) 
							CurrentHighest=iNum;
						}
					}
				else if (iNum < 10000 && iNum > 1000) { //if its a 4-figure number
					if (SNumSlices[1] == SNumSlices[4] && SNumSlices[2] == SNumSlices[3]) {
						if (iNum > CurrentHighest) 
							CurrentHighest=iNum;
						}
					}
				}
			}
			
			System.out.println("The answer is: " + CurrentHighest);
			
		}
	}
//}

