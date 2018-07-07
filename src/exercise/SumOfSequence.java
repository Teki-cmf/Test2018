package exercise;

import java.util.Scanner;

public class SumOfSequence {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		double sum = 0;
		double []str=new double[m];
		str[0]=n;
		for(int i=1;i<m;i++){
			str[i]=Math.sqrt(str[i-1]);
		}
		for(int i=0;i<m;i++){
			sum=sum+str[i];	
		}
		 System.out.println(String.format("%.2f", sum));
	}
}
