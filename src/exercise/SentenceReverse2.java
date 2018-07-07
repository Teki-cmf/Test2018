package exercise;

import java.awt.datatransfer.StringSelection;
import java.io.StringBufferInputStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class SentenceReverse2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] strings=new String[10];
 		int i=0;
		while (input.hasNext()) {
			strings = input.nextLine().split(" ");
			for (i=strings.length-1; i >=0 ; i--) {
			System.out.print(strings[i]+" ");
		}
		}
		
	}
}
