package exercise;
import java.util.Scanner;

public class Printer {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
		int n = 4, m = 3;
		int[] ma = printMatrix(mat, n, m);
		for (int i = 0; i < ma.length; i++) {
			System.out.print(ma[i] + "  ");
		}
	}

	public static int[] printMatrix(int[][] mat, int n, int m) {
		int[] ma = new int[n * m];
		int p = 0;
		int i, j;
		for (i = 0; i < n; i++) {
			if (i % 2 == 0) {
				for (j = 0; j < m; j++) {
					ma[p++] = mat[i][j];
				}
			} 
			else {
				for (j = m - 1; j >= 0; j--) {
					ma[p++] = mat[i][j];
				}
			}
		}
		return ma;
	}
}
