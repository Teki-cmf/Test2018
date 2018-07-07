package exercise;
import java.util.*;

public class Rotate {
	public static void main(String[] args) {
	 	int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }};
			int n = 3;
			int[][] ma = rotateMatrix(mat, n);
			int i,j;
			for(i=0;i<n;i++)
	    	{
	    		for(j=0;j<n;j++)
	    		{
	    			System.err.println(ma[i][j]);
	    		}
	    	}
			
	}
    public static int[][] rotateMatrix(int[][] mat, int n) {
    	int [][]ma=new int [n][n];
    	int i,j;
    	for(i=0;i<n;i++)
    	{
    		for(j=0;j<n;j++)
    		{
    			ma[i][j]=mat[n-1-j][i];
    		}
    	}
		return ma;
        // write code here
    }
}