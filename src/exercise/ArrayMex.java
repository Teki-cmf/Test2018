package exercise;

public class ArrayMex {
public static void main(String[] args) {
	   int []A={-1,2,3,1};
	    int n=4;
	    System.out.println("数组中未出现的最小正整数"+findArrayMex(A, n));
}
	    
    public static int findArrayMex(int[] A, int n) {
    	int[] res=new int[n];
    	for(int i=0;i<n;i++){
    		if(A[i]>0&&A[i]<=n){
    			res[A[i]-1]=1;//比n小的整数如果出现则将res相应的位置置为1，如出现了5，则res[5]=1
    		}
    	}
    	for(int i=0;i<n;i++)
    	{//找到res中第一个置为0的下标，此下标加一则为未出现的最小整数
    		if(res[i]==0){
    			return i+1;
    		}
    	}
		return n+1;//当1到n都出现了，则最小的应为n+1
        // write code here
    }
}
