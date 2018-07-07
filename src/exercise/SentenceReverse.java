package exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class SentenceReverse {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] strings = new String[1000];
		int i=0;
		String line=input.nextLine();
		StringTokenizer token=new StringTokenizer(line);
		while (token.hasMoreTokens()) {
			String object = (String) token.nextElement();
			strings[i++] = object;
		}
		for (i--; i >=0 ; i--) {
			System.out.print(strings[i]+" ");
		}
	}
}
