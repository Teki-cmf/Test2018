package exercise;
import java.util.*;

public class StringPattern {

    public static void main(String[] args) {  
        String s = "abbabbbbcab"; // ����  
        String t = "bbcab"; // ģʽ��  
        char[] ss = s.toCharArray();  
        char[] tt = t.toCharArray();  
        System.out.println(s.indexOf(t)); // KMPƥ���ַ���  
    }  
  
    /** 
     * ����ַ�����next����ֵ 
     *  
     * @param b 
     *            �ַ��� 
     * @return next����ֵ 
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
     * KMPƥ���ַ��� 
     *  
     * @param s 
     *            ���� 
     * @param t 
     *            ģʽ�� 
     * @return ��ƥ��ɹ��������±꣬���򷵻�-1 
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
             return i - lenb; // ����ģʽ���������е�ͷ�±�  
     }  */
        // write code here
    }
