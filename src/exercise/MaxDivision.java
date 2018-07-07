package exercise;

public class MaxDivision {
	public static void main(String[] args) {
    int []A={9,3,1,10};
    int n=4;
    System.out.println("最大差值为"+findMaxDivision(A, n));
	}

	public static int findMaxDivision(int[] A, int n) {
		//桶排序参考讨论中的思路
		int maxnum = A[0];
		int minnum = A[0];
		for (int i = 0; i < A.length; i++) {
			if (maxnum < A[i])
				maxnum = A[i];
			if (minnum > A[i])
				minnum = A[i];
		}
		int[] arr = new int[maxnum - minnum + 1]; // 生成桶
		for (int i = 0; i < A.length; i++) {
			arr[A[i] - minnum]++; // 填桶
		}
		int count = 0;
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) { // 桶为空
				count++; // 记录连续空桶数
			} else {
				if (max < count)
					max = count;
				count = 0;
			}
		}
		return max + 1; // 如最大值为9，最小值为3，中间有5个空桶，但差值应为6
	}
}
