package exercise;

import java.util.Scanner;

public class FlowerNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int m = input.nextInt();
		int n = input.nextInt();
		int count = 0;
		for (int i = m, j=0; i <= n; i++,j++) {
			int x1 = i / 100;
			int x2 = (i - x1 * 100) / 10;
			int x3 = i % 10;
			if (i == (x1 * x1 * x1 + x2 * x2 * x2 + x3 * x3 * x3)) {
                if(count==0)
                    System.out.print(i);
                else
				System.out.print(" "+i);
				count++;
			}
		}
		if (count == 0)
			System.out.println("no");
	}
}
