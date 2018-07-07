package exercise;

import java.util.Scanner;

public class RiverCrossing {
	public static int[] spring;
	public static int[] step;

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		spring = new int[n];

		for (int i = 0; i < n; i++) {

			spring[i] = in.nextInt();

		}

		step = new int[n + 1];

		for (int i = 0; i < n + 1; i++) {

			step[i] = 10000000;

		}

		step[0] = 0;

		for (int i = 0; i < n; i++)

		{

			if (spring[i] == 0)
				continue;

			for (int j = 1; j <= spring[i]; j++)

			{

				if (i + j > n)
					break;

				if (i + j == n) {

					if (step[n] > step[i] + 1)

						step[n] = step[i] + 1;

					break;

				}

				if (i + j < n) {

					if (step[i + j] > step[i] + 1)

						step[i + j] = step[i] + 1;

				}

			}

		}

		if (step[n - 1] == 10000000)

		{

			System.out.println(-1);

			return;

		}

		System.out.println(step[n]);

	}

}