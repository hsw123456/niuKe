package cn.hsw.niuke;

import java.util.Scanner;

public class TestShuffle {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int time = scanner.nextInt();
		
		for (int i = 0; i < time; i++) {
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			
			int[] arr = new int[2 * n];

			for (int j = 0; j < 2 * n; j++) {
				arr[j] = scanner.nextInt();
			}
			
			outPut(parse(n, k, arr));
		}
	}

	private static void outPut(int[] array) {

		System.out.print(array[0]);
		for (int i = 1; i < array.length; i++) {
			System.out.print(" " + array[i]);
		}
		System.out.println();

	}

	private static int[] swap(int[] arr) {
		int n = arr.length;
		int[] one = new int[n / 2];
		int[] other = new int[n / 2];
		int[] newArr = new int[n];
		System.arraycopy(arr, 0, one, 0, n / 2);
		System.arraycopy(arr, n / 2, other, 0, n / 2);

		int i = 0, j = 0;

		for (int k = 0; k < n; k++) {
			if (k % 2 == 0) {
				newArr[k] = one[i++];
			} else {
				newArr[k] = other[j++];
			}
		}

		return newArr;

	}

	private static int[] parse(int n, int k, int[] arr) {
		int m = k % (n + 1);
		if (m == 0) {
			return arr;
		} else {

			for (int i = 0; i < m; i++) {
				arr = swap(arr);
			}

			return arr;
		}

	}

}
