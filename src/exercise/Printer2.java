package exercise;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class Printer2 {
	public static void main(String[] args) {
		int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
		int n = 4, m = 3;
		int[] result= clockwisePrint(mat, n, m);
		for (int i = 0; i < n*m; i++) {
			System.out.print(result[i] + "  ");
		}
	}

	public static int[] clockwisePrint(int[][] mat, int n, int m) {
		int []result=new int[n*m];
		int i=0,j=0;
		int RowMin=0;
		int ColumnMin=0;
		int RowMax=n-1;
		int ColumnMax=m-1;
		for(int count=0;count<n*m;count++){
			result[count]=mat[i][j];
			if(i==RowMin&&j<ColumnMax){
				j++;
			}
			else if(i<RowMax&&j==ColumnMax){
				i++;
			}
			else if(i==RowMax&&j>ColumnMin){
				j--;
			}
			else if(i>RowMin&&j==ColumnMin){
				i--;
			}
			if(i==RowMin&&j==ColumnMin){
				RowMin++;
				ColumnMin++;
				RowMax--;
				ColumnMax--;
				i=RowMin;
				j=ColumnMin;
			}
		}
		return result;
		// write code here
	}
}
