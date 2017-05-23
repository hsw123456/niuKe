package cn.hsw.niuke;

import java.util.Scanner;

public class TestGC {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int initPow = scanner.nextInt();
			int[] arr = new int[n];

			for (int i = 0; i < n; i++) {
				arr[i] = scanner.nextInt();
			}

			for (int i = 0; i < n; i++) {
				if (arr[i] <= initPow)
					initPow += arr[i];
				else {
					initPow += gcd(arr[i], initPow);
				}
			}

			System.out.println(initPow);
		}

	}

	public static int gcd(int m, int n) {

		if (n == 0)
			return m;
		else {
			return gcd(n, m % n);
		}
	}

}
