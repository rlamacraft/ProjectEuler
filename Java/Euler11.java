import java.util.Scanner;
import java.io.*;

public class Euler11 {
	public static void main (String args[]) throws IOException {
		int[][] list = new int[20][20];
		String path = "/Users/Robert/input.txt";
		File file = new File(path);
		Scanner read = null;
		try {
			read = new Scanner(file);
			String s = "";
		
			//INPUT
			for(int i = 0;i<20;i++) {
				s = read.nextLine();
				for(int j = 0;j<60;j++) {
					if(s.charAt(j)==' ') {
						String temp = s.charAt(j-2) + "" + s.charAt(j-1);
						list[i][((j+1)/3)-1]=Integer.parseInt(temp);
					}	
				}
			}
		} finally {
			if(read != null) 
				read.close();
		}
		
		//ANALYSE
		int max = 0;
		for(int i = 3;i<17;i++) {
			for(int j = 3;j<17;j++) {
				System.out.println(i + "," + j);
				if(list[i-3][j-3] * list[i-2][j-2] * list[i-1][j-1] * list[i][j] > max)
					max = list[i-3][j-3] * list[i-2][j-2] * list[i-1][j-1] * list[i][j];
				if(list[i][j-3] * list[i][j-2] * list[i][j-1] * list[i][j] > max)
					max = list[i][j-3] * list[i][j-2] * list[i][j-1] * list[i][j];
				if(list[i+3][j-3] * list[i+2][j-2] * list[i+1][j-1] * list[i][j] > max)
					max = list[i+3][j-3] * list[i+2][j-2] * list[i+1][j-1] * list[i][j];
				if(list[i+3][j] * list[i+2][j] * list[i+1][j] * list[i][j] > max)
					max = list[i*3][j] * list[i*2][j] * list[i*1][j] * list[i][j];
				if(list[i+3][j+3] * list[i+2][j+2] * list[i+1][j+1] * list[i][j] > max)
					max = list[i+3][j+3] * list[i+2][j+2] * list[i+1][j+1] * list[i][j];
				if(list[i][j+3] * list[i][j+2] * list[i][j+1] * list[i][j] > max)
					max = list[i][j+3] * list[i][j+2] * list[i][j+1] * list[i][j];
				if(list[i-3][j+3] * list[i-2][j+2] * list[i-1][j+1] * list[i][j] > max)
					max = list[i-3][j+3] * list[i-2][j+2] * list[i-1][j+1] * list[i][j];
				if(list[i-3][j] * list[i-2][j] * list[i-1][j] * list[i][j] > max)
					max = list[i-3][j] * list[i-2][j] * list[i-1][j] * list[i][j];
			}
		}
		
		//OUPUT
		System.out.println("The answer is " + max);
		
	}
}