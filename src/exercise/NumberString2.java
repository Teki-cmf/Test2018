package exercise;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class NumberString2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String[] strings = new String[n];
		for (int i = 0; i < n; i++) {
			strings[i] = input.next();
		}
		mysort(strings);
		for (int i = n-1; i >=0 ; i--) {
			System.out.print(strings[i]);
		}
	}
	public static void mysort(String[] strs){
		int n=strs.length;
		String tmp=new String();
	    for(int i=0;i<n;i++){
	    	for(int j=0;j<n;j++){
	    		if(((strs[i].concat(strs[j])).compareTo(strs[j].concat(strs[i])))<0){
	    		tmp=strs[i];
	    		strs[i]=strs[j];
	    		strs[j]=tmp;
	    		}
	    	}
	    } 
	}
}
