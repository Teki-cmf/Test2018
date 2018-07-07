package exercise;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String A=input.nextLine();
		int n=input.nextInt();
		int p=input.nextInt();
		System.out.println(rotateString(A,n,p));
	}
	public static String rotateString(String A, int n, int p) {
		String str=A.substring(p+1,n);
		String str2=A.substring(0,p+1);
		return str+str2;
	        // write code here
	    }
}
 