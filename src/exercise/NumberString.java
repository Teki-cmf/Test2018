package exercise;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class NumberString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String[] strings = new String[n];
		for (int i = 0; i < n; i++) {
			strings[i] = input.next();
		}
		Arrays.sort(strings);
		for (int i = n-1; i >=0 ; i--) {
			System.out.print(strings[i]);
		}
	}
}
