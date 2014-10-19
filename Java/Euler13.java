import java.io.*;
import java.util.Scanner;

public class Euler13 {
	public static void main(String args[]) throws IOException {
		long[][] grid = new long[100][5];
		String path = "/Users/Robert/input.txt";
		File file = new File(path);
		Scanner read = null;
		String temp = "";
		
		
		//INPUT
		try {
			read = new Scanner(file);
			String s = "";
			
			for(int i = 0;i<100;i++) {
				s = read.nextLine();
				temp = s.substring(0,10);
				grid[i][0] = Long.valueOf(temp);
				temp = s.substring(10,20);
				grid[i][1] = Long.valueOf(temp);
				temp = s.substring(20,30);
				grid[i][2] = Long.valueOf(temp);
				temp = s.substring(30,40);
				grid[i][3] = Long.valueOf(temp);
				temp = s.substring(40,50);
				grid[i][4] = Long.valueOf(temp);
			}
		} finally {
			if(read != null) 
				read.close();
		}
		
		//PROCESSING
		for(int z=0;z<5;z++) {
			System.out.println(grid[0][z]+",");
		}	
		for(int i=4;i>=0;i--) {
			System.out.println("i = "+i);
			for(int j=0;j<100;j++) {
				grid[0][i] += grid[j][i];
			}
			if(i>0) {
				//CARRY
				temp = "" + /*Integer.valueOf(*/grid[0][i];
				temp = temp.substring(0,temp.length()-10);
				System.out.println("carry part: "+temp);
				long carry = Long.valueOf(temp);
				System.out.println(grid[0][i-1]);
				grid[0][i-1] = grid[0][i-1] + carry;
				System.out.println(grid[0][i-1]);
				for(int z=0;z<5;z++) {
					System.out.println(grid[0][z]+",");
				}
			}
			//System.out.println(grid[0][4]);
		}
		
		System.out.println("--------------------------");
		/*System.out.print("Final num: ");
		for(int i=0;i<5;i++) {
			System.out.println(grid[0][i]+",");
		}
		System.out.println(grid[0][0]);*/
		System.out.println(grid[0][3]);
		
		
	}
}
//NOT 5574483513, 5574483517, 5574483518