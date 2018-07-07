package exercise;
import java.util.*;

public class StringPattern {

    public static void main(String[] args) {  
        String s = "abbabbbbcab"; // 主串  
        String t = "bbcab"; // 模式串  
        char[] ss = s.toCharArray();  
        char[] tt = t.toCharArray();  
        System.out.println(s.indexOf(t)); // KMP匹配字符串  
    }  
  
    /** 
     * 获得字符串的next函数值 
     *  
     * @param b 
     *            字符串 
     * @return next函数值 
     */  /*
    public static int[] next(String b) {  
        int[] next = new int[b.length];  
        next[0] = -1;  
        int i = 0;  
        int j = -1;  
        while (i < b.length - 1) {  
            if (j == -1 || b[i] == b[j]) {  
                i++;  
                j++;  
                if (b[i] != b[j]) {  
                    next[i] = j;  
                } else {  
                    next[i] = next[j];  
                }  
            } else {  
                j = next[j];  
            }  
        }  
        return next;  
    }  
  
    /** 
     * KMP匹配字符串 
     *  
     * @param s 
     *            主串 
     * @param t 
     *            模式串 
     * @return 若匹配成功，返回下标，否则返回-1 
     */  
	/*
    public int findAppearance(String A, int lena, String B, int lenb) {
    	 int[] nex = next(B);  
         int i = 0;  
         int j = 0;  
         while (i <=lena - 1 && j <= lenb- 1) {  
             if (j == -1 || A.indexOf(B)==0)[i]==B[j]) {  
                 i++;  
                 j++;  
             } else {  
                 j = next[j];  
             }  
         }  
         if (j < lenb) {  
             return -1;  
         } else  
             return i - lenb; // 返回模式串在主串中的头下标  
     }  */
        // write code here
    }
