package exercise;

public class ArrayMex {
public static void main(String[] args) {
	   int []A={-1,2,3,1};
	    int n=4;
	    System.out.println("������δ���ֵ���С������"+findArrayMex(A, n));
}
	    
    public static int findArrayMex(int[] A, int n) {
    	int[] res=new int[n];
    	for(int i=0;i<n;i++){
    		if(A[i]>0&&A[i]<=n){
    			res[A[i]-1]=1;//��nС���������������res��Ӧ��λ����Ϊ1���������5����res[5]=1
    		}
    	}
    	for(int i=0;i<n;i++)
    	{//�ҵ�res�е�һ����Ϊ0���±꣬���±��һ��Ϊδ���ֵ���С����
    		if(res[i]==0){
    			return i+1;
    		}
    	}
		return n+1;//��1��n�������ˣ�����С��ӦΪn+1
        // write code here
    }
}
