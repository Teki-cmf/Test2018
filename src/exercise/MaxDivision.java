package exercise;

public class MaxDivision {
	public static void main(String[] args) {
    int []A={9,3,1,10};
    int n=4;
    System.out.println("����ֵΪ"+findMaxDivision(A, n));
	}

	public static int findMaxDivision(int[] A, int n) {
		//Ͱ����ο������е�˼·
		int maxnum = A[0];
		int minnum = A[0];
		for (int i = 0; i < A.length; i++) {
			if (maxnum < A[i])
				maxnum = A[i];
			if (minnum > A[i])
				minnum = A[i];
		}
		int[] arr = new int[maxnum - minnum + 1]; // ����Ͱ
		for (int i = 0; i < A.length; i++) {
			arr[A[i] - minnum]++; // ��Ͱ
		}
		int count = 0;
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) { // ͰΪ��
				count++; // ��¼������Ͱ��
			} else {
				if (max < count)
					max = count;
				count = 0;
			}
		}
		return max + 1; // �����ֵΪ9����СֵΪ3���м���5����Ͱ������ֵӦΪ6
	}
}
